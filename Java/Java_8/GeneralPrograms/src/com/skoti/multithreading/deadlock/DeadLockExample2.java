package com.skoti.multithreading.deadlock;


public class DeadLockExample2 {

    public static void main(String[] args) {
        Object reentrantLock1 = new Object();
        Object reentrantLock2= new Object();

        RunnableSync1 runnable1 = new RunnableSync1(reentrantLock1,reentrantLock2);
        RunnableSync2 runnable2 = new RunnableSync2(reentrantLock1,reentrantLock2);

        Thread thread1 = new Thread(runnable1, "Thread:1");
        Thread thread2 = new Thread(runnable2, "Thread:2");

        thread1.start();
        thread2.start();
    }
}
