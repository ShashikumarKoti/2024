package com.skoti.multithreading.racecondition;


public class RaceConditionExample3 {

    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();

        Thread thread1 = new Thread(getRunnable(counter1, counter2, "Thread1"));
        Thread thread2 = new Thread(getRunnable(counter2, counter1, "Thread2"));

        thread1.start();
        thread2.start();

    }

    private static Runnable getRunnable(Counter counter1, Counter counter2, String runnable) {
        return () -> {
            for (int i = 0; i < 10000; i++) {
                counter1.incAndGet();
            }
            System.out.println(runnable + " final count - counter1: "+ counter1.getCount());
            System.out.println(runnable + " final count - counter2: "+ counter2.getCount());
        };
    }
}
