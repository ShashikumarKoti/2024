package com.skoti.completeablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example1 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Main:" + Thread.currentThread().getName());
        CompletableFuture<String> future = CompletableFuture.supplyAsync(
                () -> {
                    System.out.println("Inside completableFuture: " + Thread.currentThread().getName());
                    return "Hello";
                }
        );

       //future.get() is blocking code
        System.out.println(future.get());
    }

}
