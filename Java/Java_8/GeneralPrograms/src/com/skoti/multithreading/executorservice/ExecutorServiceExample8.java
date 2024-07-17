package com.skoti.multithreading.executorservice;

import java.util.concurrent.*;

public class ExecutorServiceExample8 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Future<String> future = executorService.submit(newCallable());

        System.out.println(future.isDone());

        boolean mayInterrupt = false;
        boolean cancelled = future.cancel(mayInterrupt);
        System.out.println("isCancelled? :" + cancelled);

        try {
            String result = future.get();
            System.out.println("Result is: " + result);
        } catch (InterruptedException | ExecutionException ignored) {
        } catch (CancellationException cancellationException) {
            System.out.println("Cannot call future.get() as task was cancelled");
        }

        System.out.println(future.isDone());
        System.out.println(future.isCancelled());
        executorService.shutdown();
    }

    private static Callable<String> newCallable() {
        return () -> Thread.currentThread().getName() + " : " + "Task-1";
    }
}




