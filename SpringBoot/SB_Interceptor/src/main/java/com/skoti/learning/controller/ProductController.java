package com.skoti.learning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController {

    @GetMapping("/products/new")
    public String getAllProducts() {
        return "All products returned";
    }
}
