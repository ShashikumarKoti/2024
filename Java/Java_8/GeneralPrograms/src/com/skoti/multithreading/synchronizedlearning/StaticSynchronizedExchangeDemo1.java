package com.skoti.multithreading.synchronizedlearning;

public class StaticSynchronizedExchangeDemo1 {

    public static void main(String[] args) {
        Thread thread1 = new Thread(
                () -> {
                    for (int i = 0; i < 1000; i++) {
                        System.out.println(Thread.currentThread().getName());
                        StaticSynchronizedExchanger.setObject(" " + i);
                    }
                }
        );

        Thread thread2 = new Thread(
                () -> {
                    for (int i = 0; i < 1000; i++) {
                        System.out.println(Thread.currentThread().getName() + "::" + StaticSynchronizedExchanger.getObject());
                    }
                }
        );

        thread1.start();
        thread2.start();
    }
}

class StaticSynchronizedExchanger {

    protected static Object object = null;

    public static synchronized Object getObject() {
        return object;
    }

    public static synchronized void setObject(Object o) {
        object = o;
    }

    public void setObj(Object o) {
        synchronized (StaticSynchronizedExchanger.class) {
            object = o;
        }
    }

    public Object getObj() {
        synchronized (StaticSynchronizedExchanger.class) {
            return object;
        }
    }
}