package com.example.webclient;

import com.example.webclient.controller.ProductController;
import com.example.webclient.dto.ProductDto;
import com.example.webclient.service.ProductService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@WebFluxTest(ProductController.class)
class SbWebClientApplicationTests {

	@Autowired
	private WebTestClient webTestClient;

	@MockBean
	private ProductService productService;

	@Test
	public void saveProductTest() {
		Mono<ProductDto> productDtoMono =
				Mono.just(new ProductDto("111", "Mobile",1, 35000));
		when(productService.saveProduct(productDtoMono)).thenReturn(productDtoMono);

		webTestClient.post().uri("/products")
				.body(Mono.just(productDtoMono),ProductDto.class)
				.exchange()
				.expectStatus().isOk();
	}

	@Test
	public void getProductsTest() {
		Flux<ProductDto> productDtoFlux = Flux.just(new ProductDto("111", "Mobile",1, 35000),
				new ProductDto("222", "Laptop",2, 12000));
		when(productService.getProducts()).thenReturn(productDtoFlux);

		Flux<ProductDto> responseBody = webTestClient.get().uri("/products")
				.exchange()
				.expectStatus().isOk()
				.returnResult(ProductDto.class)
				.getResponseBody();

		StepVerifier.create(responseBody)
				.expectSubscription()
				.expectNext(new ProductDto("111", "Mobile",1, 35000))
				.expectNext(new ProductDto("222", "Laptop",2, 12000))
				.verifyComplete();
	}

	@Test
	public void getProductTest() {
		Mono<ProductDto> productDtoMono = Mono.just(new ProductDto("111", "Mobile",1, 35000));
		when(productService.getProductById(any())).thenReturn(productDtoMono);

		Flux<ProductDto> responseBody = webTestClient.get().uri("/products/111")
				.exchange()
				.expectStatus().isOk()
				.returnResult(ProductDto.class)
				.getResponseBody();

		StepVerifier.create(responseBody)
				.expectSubscription()
				.expectNextMatches(product -> product.getName().equals("Mobile"))
				.verifyComplete();
	}

	@Test
	public void updateProductTest() {
		Mono<ProductDto> productDtoMono =
				Mono.just(new ProductDto("111", "Mobile",1, 35000));
		when(productService.updateProduct(productDtoMono,"111")).thenReturn(productDtoMono);

		webTestClient.put().uri("/products//update/111")
				.body(Mono.just(productDtoMono),ProductDto.class)
				.exchange()
				.expectStatus().isOk();
	}

	@Test
	public void deleteProduct() {
		given(productService.deleteProduct(any())).willReturn(Mono.empty());
		webTestClient.delete().uri("/products/delete/111")
				.exchange()
				.expectStatus().isOk();
	}

}
