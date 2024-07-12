package com.skoti.multithreading.synchronizedlearning;

public class SynchronizedExchangerDemo1 {

    public static void main(String[] args) {
        SynchronizedExchanger synchronizedExchanger = new SynchronizedExchanger();
        Thread thread1 = new Thread(
                () -> {
                    for (int i = 0; i < 1000; i++) {
                        synchronizedExchanger.setObject(" " + i);
                    }
                }
        );

        Thread thread2 = new Thread(
                () -> {
                    for (int i = 0; i < 1000; i++) {
                        System.out.println(Thread.currentThread().getName() + "::" + synchronizedExchanger.getObject());
                    }
                }
        );

        thread1.start();
        thread2.start();
    }
}


class SynchronizedExchanger {

    protected Object object = null;

    public synchronized Object getObject() {
        return object;
    }

    public synchronized void setObject(Object object) {
        this.object = object;
    }

    public void setObj(Object object) {
        synchronized (this) {
            this.object = object;
        }
    }

    public Object getObj() {
        synchronized (this) {
            return this.object;
        }
    }
}