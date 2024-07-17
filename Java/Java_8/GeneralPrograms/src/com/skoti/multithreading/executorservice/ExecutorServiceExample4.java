package com.skoti.multithreading.executorservice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample4 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        Future<?> future = executorService.submit(newRunnable("Task-1.1"));
        System.out.println(future.isDone());

        try {
            System.out.println("Main thread waiting for run() method to complete to get future.get() value ");
            future.get();
            System.out.println("future.get() " + future.get());

        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(future.isDone());

        executorService.shutdown();
    }

    private static Runnable newRunnable(String task) {
        return () -> {
            System.out.println("Run is executing");
            String completeMessage = Thread.currentThread().getName() + " : " + task;
            System.out.println(completeMessage);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Run method completed");
        };
    }
}
