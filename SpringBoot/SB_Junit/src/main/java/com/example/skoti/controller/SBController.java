package com.example.skoti.controller;

import com.example.skoti.service.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SBController {

    private final GreetingService greetingService;

    public SBController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/greet")
    public String greeting() {
        return greetingService.greet();
    }
}
