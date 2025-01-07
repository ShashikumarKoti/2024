package com.example.SB_Async.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@Service
public class TestAsyncService {

    private final RestTemplate restTemplate;

    public TestAsyncService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    //@Async
    public CompletableFuture<String> asyncAPICall() throws ExecutionException, InterruptedException {
        String url = "http://localhost:8181/bookMyShow/getBooking";
        String result = restTemplate.getForObject(url, String.class);
        CompletableFuture<String> completedFuture = CompletableFuture.completedFuture(result);
    System.out.println(completedFuture.get());
    return CompletableFuture.completedFuture(result);
    }

  //  @Async
    public void dummyMethod() {

        for (int i=0;i<=10;i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Count:" + i);
        }
    }


}
