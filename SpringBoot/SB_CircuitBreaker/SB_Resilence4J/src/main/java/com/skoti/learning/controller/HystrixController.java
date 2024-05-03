package com.skoti.learning.controller;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.slf4j.helpers.CheckReturnValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.client.RestTemplate;

import java.util.Date;

@RestController
@RequestMapping("/hystrixDemo")
public class HystrixController {

  @Autowired private RestTemplate restTemplate;

  private int attempt=1;

  @GetMapping("/greet")
  //@CircuitBreaker(name = "userService", fallbackMethod = "bookMyShowFallBack")
  @Retry(name = "userService", fallbackMethod = "bookMyShowFallBack")
  public String greet() throws InterruptedException {
    System.out.println("retry method called "+attempt++ +" times "+" at "+new Date());
    String restTemplateForObject =
        restTemplate.getForObject("http://localhost:8181/bookMyShow/getBooking", String.class);
    return restTemplateForObject;
  }

  public String bookMyShowFallBack(Exception e) {
    return "Kindly try after sometime as there is an outage!!";
  }
}
