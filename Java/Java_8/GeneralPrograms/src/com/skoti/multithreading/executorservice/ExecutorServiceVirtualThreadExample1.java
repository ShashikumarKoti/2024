package com.skoti.multithreading.executorservice;

import java.util.concurrent.*;

public class ExecutorServiceVirtualThreadExample1 {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor();

        executorService.submit(
                () -> System.out.println("This Runnable is executed by virtual thread")
        );

        Callable<String> callable = () -> {
            System.out.println("Callable executed by virtual thread");
            return "Result from callable";
        };

        Future<String> future = executorService.submit(callable);

        try {
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        executorService.shutdown();
    }
}
