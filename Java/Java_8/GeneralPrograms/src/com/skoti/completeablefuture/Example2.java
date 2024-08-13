package com.skoti.completeablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example2 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        //Case-1
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 10)
                .thenApply(result -> result * 2)
                .thenApply(result -> result + 5);

        future.thenAccept(System.out::println);

        //Case-2
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> "Hello");
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> "World");

        CompletableFuture<String> combinedFuture = future1.thenCombine(future2, (res1,res2) -> res1 + " "+ res2);
        System.out.println(combinedFuture.get());


        //Case-3
        //cf.get() is blocking code, which means when the above string is converted to uppercase, then only cf.get() is called
        CompletableFuture<String> cf = CompletableFuture.completedFuture("message from synchronous")
                .thenApply(
                        String::toUpperCase
                );
        System.out.println(cf.get());

        //Case-4
        //cf.join() is non-blocking code, and also we have used thenApplyAsync which is asynchronous
        CompletableFuture<String> cf1 = CompletableFuture.completedFuture("message from asynchronous")
                .thenApplyAsync(String::toUpperCase);
        System.out.println(cf1.join());

    }
}
