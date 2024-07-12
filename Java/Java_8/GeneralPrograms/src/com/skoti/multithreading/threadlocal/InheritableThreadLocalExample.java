package com.skoti.multithreading.threadlocal;

public class InheritableThreadLocalExample {

    public static void main(String[] args) {

        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        InheritableThreadLocal<String> inheritableThreadLocal = new InheritableThreadLocal<>();

        Thread parentThread = new Thread(
                () -> {
                    System.out.println("===Thread-1======");
                    threadLocal.set("Thread-1 threadLocal");
                    inheritableThreadLocal.set("Thread-1 - inheritableThreadLocal");

                    System.out.println(threadLocal.get());
                    System.out.println(inheritableThreadLocal.get());

                    Thread childThread = new Thread(
                            () -> {
                                System.out.println("===Child thread======");
                                System.out.println(threadLocal.get());
                                System.out.println(inheritableThreadLocal.get());
                            }
                    );
                    childThread.start();
                }
        );


        Thread thread2 = new Thread(
                () -> {
                    System.out.println("===Thread-2======");
                    System.out.println(threadLocal.get());
                    System.out.println(inheritableThreadLocal.get());
                }
        );
        parentThread.start();
        thread2.start();
    }
}
