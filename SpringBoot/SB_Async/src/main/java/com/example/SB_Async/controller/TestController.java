package com.example.SB_Async.controller;

import com.example.SB_Async.service.TestAsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestAsyncService testAsyncService;

    @GetMapping("/aysnCall")
    public  String dummyTest() throws ExecutionException, InterruptedException {
        testAsyncService.dummyMethod();
        CompletableFuture<String> completableFuture = testAsyncService.asyncAPICall();
        String s = completableFuture.get();
        return s;
    }
}
