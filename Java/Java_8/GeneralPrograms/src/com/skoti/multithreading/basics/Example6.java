package com.skoti.multithreading.basics;

public class Example6 {

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            while (true) {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Running");
            }
        };
        Thread thread = new Thread(runnable);
        //uncomment below line and check the behavior
        thread.setDaemon(true);
        thread.start();
        sleep(3100);
    }

    public static void sleep(long millis) throws InterruptedException {
        Thread.sleep(millis);
    }
}
