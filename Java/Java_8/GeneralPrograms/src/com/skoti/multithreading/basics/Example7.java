package com.skoti.multithreading.basics;

public class Example7 {

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            for (int i = 0; i <= 5; i++) {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Running");
            }
        };

        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        thread.start();

        //comment below line and check behavior
        thread.join();
    }

    public static void sleep(long millis) throws InterruptedException {
        Thread.sleep(millis);
    }
}
