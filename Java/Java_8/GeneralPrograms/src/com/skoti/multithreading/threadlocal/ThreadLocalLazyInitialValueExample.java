package com.skoti.multithreading.threadlocal;

public class ThreadLocalLazyInitialValueExample {

    public static void main(String[] args) {

        ThreadLocal<String> threadLocal = new ThreadLocal<>();

        String value = threadLocal.get();
        if (value == null){
            threadLocal.set("Lazy init value");
            value = threadLocal.get();
        }

        System.out.println(value);
    }
}
