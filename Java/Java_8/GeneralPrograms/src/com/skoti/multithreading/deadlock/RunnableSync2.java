package com.skoti.multithreading.deadlock;

public class RunnableSync2 implements Runnable{

    private final Object object1;
    private final Object object2;

    public RunnableSync2(Object object1, Object object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " attempting to lock lock2");
        synchronized (object2) {
            System.out.println(threadName + " acquired lock2");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(threadName + " attempting to lock lock1");
            synchronized (object1){
                System.out.println(threadName + " acquired lock1");
            }
            System.out.println(threadName + " unlocking lock1");
        }
        System.out.println(threadName + " unlocking lock2");
    }
}
