package com.example.webclient.service;

import com.example.webclient.dto.ProductDto;
import com.example.webclient.entity.Product;
import com.example.webclient.repo.ProductRepo;
import com.example.webclient.util.AppUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Range;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public Flux<ProductDto> getProducts() {
        return productRepo.findAll().map(AppUtil::entityToDto);
    }

    public Mono<ProductDto> getProductById(String id) {
        return productRepo.findById(id).map(AppUtil::entityToDto);
    }

    public Flux<ProductDto> getProductInPriceRange(double min, double max) {
        return productRepo.findByPriceBetween(Range.closed(min, max));
    }

    public Mono<ProductDto> saveProduct(Mono<ProductDto> productDtoMono) {
        return productDtoMono.map(AppUtil::dtoToEntity)
                .flatMap(productRepo::insert)
                .map(AppUtil::entityToDto);
    }

    public Mono<ProductDto> updateProduct(Mono<ProductDto> productDtoMono, String id) {
        return productRepo.findById(id)
                .flatMap(product -> productDtoMono.map(AppUtil::dtoToEntity)
                        .doOnNext(e -> e.setId(id)))
                .flatMap(productRepo::save)
                .map(AppUtil::entityToDto);
    }

    public Mono<Void> deleteProduct(String id) {
        return productRepo.deleteById(id);
    }
}
