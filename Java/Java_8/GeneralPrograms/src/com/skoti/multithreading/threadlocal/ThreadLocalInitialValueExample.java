package com.skoti.multithreading.threadlocal;

public class ThreadLocalInitialValueExample {

    public static void main(String[] args) {

        //Approach 1
        ThreadLocal<Object> threadLocal1 = new ThreadLocal<>() {
            @Override
            protected Object initialValue() {
                return new Object();
            }
        };

        //Approach 2
        ThreadLocal<Object> threadLocal2 = ThreadLocal.withInitial(
                Object::new
        );

        Thread thread1 = new Thread(
                () -> {
                    System.out.println("threadLocal1: " + threadLocal1.get());
                    System.out.println("threadLocal2: " + threadLocal2.get());
                }
        );

        Thread thread2 = new Thread(
                () -> {
                    System.out.println("threadLocal1: " + threadLocal1.get());
                    System.out.println("threadLocal2: " + threadLocal2.get());
                }
        );

        thread1.start();
        thread2.start();
    }
}
