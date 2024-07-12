package com.skoti.multithreading.threadlocal;

public class ThreadLocalBasicExample {

    public static void main(String[] args) {

        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        Thread thread1 = new Thread(
                () -> {
                    threadLocal.set("Thread-1");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(threadLocal.get());
                }
        );

        Thread thread2 = new Thread(
                () -> {
                    threadLocal.set("Thread-2");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(threadLocal.get());
                }
        );

        thread1.start();
        thread2.start();
    }
}
