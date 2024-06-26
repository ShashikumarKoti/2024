package com.skoti.learning.controller;

import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skoti.learning.entity.Product;
import com.skoti.learning.service.ProductService;

@RestController
@RequestMapping("/products")
@Slf4j
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@PostMapping("/save")
	public List<Product> saveProducts(@RequestBody List<Product> products) {
		List<Product> productList = productService.addProduct(products);
		return productList;
	}
	
	@GetMapping("/findProducts")
	public List<Product> getProducts() {
		List<Product> allProducts = productService.findAllProducts();
		return allProducts;
	}

	@GetMapping("/findProducts/exception")
	public List<Product> getProductsException() {
        List<Product> allProducts = null;
            allProducts = productService.findAllProductsException();
        return allProducts;
    }
}
