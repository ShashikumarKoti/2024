package com.example.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/config/server/learning")
@RefreshScope
public class GreetingsController {

    @Value("${greet_message:default value}")
    private String messageFromMicroserviceSpecificFileInGitRepo;

    @Value("${message:default value}")
    private String messageFromAppPropertiesFileInGitRepo;

    @GetMapping("/greeting")
    public String greet() {
        return messageFromAppPropertiesFileInGitRepo +
                " " + messageFromMicroserviceSpecificFileInGitRepo;
    }
}
