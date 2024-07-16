package com.skoti.multithreading.racecondition;

public class RaceConditionExample2 {

    public static void main(String[] args) {

        Counter counter = new Counter();

        Thread thread1 = new Thread(getIncrementRunnable(counter, "Thread1 count"));
        Thread thread2 = new Thread(getReadingRunnable(counter, "Thread2 count"));

        thread1.start();
        thread2.start();
    }

    private static Runnable getIncrementRunnable(Counter counter, String message) {
        return () -> {
            for (int i = 0; i < 10000; i++) {
                counter.incAndGet();
            }
            System.out.println(message + " : " + counter.getCount());
        };
    }

    private static Runnable getReadingRunnable(Counter counter, String message) {
        return () -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread2 count : " + counter.getCount());
            }
        };
    }
}

