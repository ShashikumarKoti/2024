package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {


    @GetMapping("/")
    public String greet() {
        return "No Authentication";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Welcome Admin";
    }

    @GetMapping("/user")
    public String user() {
        return "Welcome User";
    }
}
