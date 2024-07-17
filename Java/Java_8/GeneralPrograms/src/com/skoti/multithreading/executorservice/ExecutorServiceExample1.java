package com.skoti.multithreading.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample1 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        executorService.execute(newRunnable("Task-1"));
        executorService.execute(newRunnable("Task-2"));
        executorService.execute(newRunnable("Task-3"));
        executorService.execute(() -> {
            String completeMessage = Thread.currentThread().getName() + " : " + "Task-4";
            System.out.println(completeMessage);
        });

        executorService.shutdown();
    }

    private static Runnable newRunnable(String task) {
        return () -> {
            String completeMessage = Thread.currentThread().getName() + " : " + task;
            System.out.println(completeMessage);
        };
    }
}
