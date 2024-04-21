package com.skoti.learning.service;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import com.skoti.learning.exception.APIErrors;
import com.skoti.learning.exception.APIException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.skoti.learning.entity.Product;
import com.skoti.learning.reposotiry.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	static {
		List<Product> productList = Arrays.asList(new Product(101, "Book", 499), new Product(102, "laptop", 78000));
	}
	
	@PostConstruct
	public void intiDB() {
		System.out.println("PostConstruct called during start up");
		productRepository.saveAll(Stream.of(new Product(101, "Book", 499), new Product(102, "laptop", 78000)).collect(Collectors.toList()));
	}
	
	public List<Product> addProduct(List<Product> products) {
		return  (List<Product>) productRepository.saveAll(products);
	}
	
	
	public List<Product> findAllProducts() {
		System.out.println("Before printing findAllProducts log");
		List<Product> productList = Arrays.asList(new Product(101, "Book", 499), new Product(102, "laptop", 78000));
		return productList;
	}

	public List<Product> findAllProductsException() {
		Set<APIErrors> errors = new HashSet<>();
		APIErrors noProductFound = new APIErrors("400", "No Product found");
		errors.add(noProductFound);
		throw new APIException(HttpStatus.BAD_REQUEST, errors);
	}
}
