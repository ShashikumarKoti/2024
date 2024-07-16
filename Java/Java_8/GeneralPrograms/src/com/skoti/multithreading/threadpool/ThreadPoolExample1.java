package com.skoti.multithreading.threadpool;

public class ThreadPoolExample1 {

    public static void main(String[] args) {

        CustomThreadPool threadPool = new CustomThreadPool(3,10);

        for (int i=0;i<10;i++) {
            int taskNum = i;
            threadPool.execute(
                    () -> {
                        String message = Thread.currentThread().getName() + ": Task :" + taskNum;
                        System.out.println(message);
                    }
            );
        }

        threadPool.waitUntilAllTasksFinished();
        threadPool.stop();
        System.out.println("All threads finished task");

    }
}

