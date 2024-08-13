package com.skoti.completeablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example5 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //Case-1
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(
                () -> {
                    int result = 10 / 0;
                    return result;
                }
        );

        future.exceptionally(ex -> {
            System.out.println("Exception occurred " + ex.getMessage());
            return 0;
        }).thenAccept(result -> System.out.println("Result " + result));

        //Case-2
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> 10/0)
                .exceptionally(ex -> 0);
        System.out.println("Future1: " + future1.get());

        //Case-3
        CompletableFuture<String> cf = CompletableFuture.completedFuture("message");
        System.out.println(cf.isDone());
        System.out.println(cf.get().equals("message"));
    }
}
