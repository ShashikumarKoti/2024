package com.example.orderservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/v1/orders")
public class OrderController {

  @GetMapping("/getOrders")
  public List<String> getAllOrders() {
    return Arrays.asList("iPhone", "iPad", "iPod");
  }
}
