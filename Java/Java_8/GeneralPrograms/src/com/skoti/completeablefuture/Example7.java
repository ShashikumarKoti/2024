package com.skoti.completeablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class Example7 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //Case-1
        StringBuilder result = new StringBuilder();
        CompletableFuture.completedFuture("thenAccept message")
                .thenAccept(result::append);
        System.out.println(result);

        //Case-2
        StringBuilder result1 = new StringBuilder();
        CompletableFuture.completedFuture("thenAcceptAsync message")
                .thenAcceptAsync(result1::append);
        Thread.sleep(500);
        System.out.println(result1);

        //Case-3
        CompletableFuture<String> cf3 = CompletableFuture.completedFuture("message")
                .thenApplyAsync(String::toUpperCase, CompletableFuture.delayedExecutor(3, TimeUnit.SECONDS));
        System.out.println(cf3.join());

        //Case-5
        CompletableFuture<String> cf = CompletableFuture.completedFuture("message").thenApplyAsync(String::toUpperCase,
                CompletableFuture.delayedExecutor(1, TimeUnit.SECONDS));
        CompletableFuture<String> cf2 = cf.exceptionally(throwable -> "canceled message");
        System.out.println(cf.cancel(true));
        System.out.println(cf.isCompletedExceptionally());
        System.out.println(cf2.join());

    }
}
