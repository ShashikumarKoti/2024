package com.skoti.multithreading.executorservice;

import java.util.concurrent.*;

public class ExecutorServiceExample2 {

    public static void main(String[] args) {

        int corePoolSize = 10;
        int maxPoolSize = 20;
        long keepAliveTime = 3000;

        //3 ways to create ExecutorService
        //Approach 1
        ExecutorService threadPoolExecutor = new ThreadPoolExecutor(
                corePoolSize, maxPoolSize, keepAliveTime, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(128)
        );

        //Approach 2
        threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);

        //Approach 3
        ExecutorService scheduledExecutorService = new ScheduledThreadPoolExecutor(corePoolSize);
        scheduledExecutorService = Executors.newScheduledThreadPool(10);
    }
}
