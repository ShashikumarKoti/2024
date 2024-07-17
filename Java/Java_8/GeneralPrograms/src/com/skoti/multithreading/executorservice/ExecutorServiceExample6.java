package com.skoti.multithreading.executorservice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorServiceExample6 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        List<Callable<String>> callables = new ArrayList<>();
        callables.add(newCallable("Task-1"));
        callables.add(newCallable("Task-2"));
        callables.add(newCallable("Task-3"));

        try {
            String result = executorService.invokeAny(callables);
            System.out.println("Result is: " + result);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        executorService.shutdown();
    }

    private static Callable<String> newCallable(String task) {
        return () -> Thread.currentThread().getName() + " : " + task;
    }
}


