package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;


@RestController
public class EmployeeController {


    @GetMapping("greet")
    public String greet() {
        return "Welcome";
    }



}