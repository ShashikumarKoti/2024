package com.skoti.multithreading.deadlock;

public class RunnableSync1 implements Runnable{

    private Object object1 = null;
    private Object object2 = null;

    public RunnableSync1(Object object1, Object object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " attempting to lock lock1");
        synchronized (object1) {
            System.out.println(threadName + " acquired lock1");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(threadName + " attempting to lock lock2");
            synchronized (object2){
                System.out.println(threadName + " acquired lock2");
            }
            System.out.println(threadName + " unlocking lock1");
        }
        System.out.println(threadName + " unlocking lock2");
    }
}
