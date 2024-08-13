package com.skoti.completeablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Example3 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //Future object, you must call the get() method to retrieve the result,
        // but this method blocks until the result is available.
        Future<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hello!!";
        });
        System.out.println(future.get());
        System.out.println(doOtherWork());
    }

    private static long doOtherWork()  {
        int result = 0;
        for (int i = 0; i < 100000; i++) {
            result = result + i;
        }
        return result;
    }
}
