package com.skoti.multithreading.executorservice;

import java.util.concurrent.*;

public class ExecutorServiceExample5 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        Future<?> future = executorService.submit(newCallable("Task-1.1"));
        System.out.println(future.isDone());

        try {
            System.out.println("Main thread waiting for call() method to complete to get future.get() value ");
            String result = (String)future.get();
            System.out.println("future.get() " + result);

        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(future.isDone());

        executorService.shutdown();
    }

    private static Callable<String> newCallable(String task) {
        return () -> {
            System.out.println("Call is executing");
            String completeMessage = Thread.currentThread().getName() + " : " + task;
            System.out.println(completeMessage);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Call method completed");
            return  completeMessage;
        };
    }
}

