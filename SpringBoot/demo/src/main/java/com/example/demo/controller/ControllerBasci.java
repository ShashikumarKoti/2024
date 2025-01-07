package com.example.demo.controller;

import com.example.demo.service.ServiceBasic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerBasci {

    @Autowired
    ServiceBasic serviceBasic;

    @GetMapping("/learn")
    public String getSomething() {
        return serviceBasic.doSomething();
    }
}
