package com.skoti.multithreading.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample2 {

    public static void main(String[] args) {
        lockBasics();
      //  lockInterruptible();
      //  tryLock();
    }

    private static void lockBasics() {
        ReentrantLock lock = new ReentrantLock(true);
        Runnable runnable = () -> {
            lockSleepUnlock(lock);
        };

        Thread thread1 = new Thread(runnable, "Thread-1");
        Thread thread2 = new Thread(runnable, "Thread-2");
        Thread thread3 = new Thread(runnable, "Thread-3");

        thread1.start();
        thread2.start();
        thread3.start();
    }

    private static void lockSleepUnlock(ReentrantLock lock) {
        try {
            lock.lock();
            System.out.println("number of threads waiting for lock: "+ lock.getQueueLength() + " and thread is " + lock.hasQueuedThreads());
            printThreadMessage();
            sleep();
        } finally {
            System.out.println(Thread.currentThread().getName() + " unlocks");
            lock.unlock();
        }
    }

    private static void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void printThreadMessage() {
        System.out.println(Thread.currentThread().getName() + " holds the lock");
    }

    public static void lockInterruptible() {
        Lock lock = new ReentrantLock();
        Thread.currentThread().interrupt();
        try {
            lock.lockInterruptibly();
            lock.unlock();
        } catch (InterruptedException interruptedException){
            System.out.println("Thread interrupted");
        }
    }

    private static void tryLock() {
        Lock lock = new ReentrantLock();
        try {
            boolean lockSuccessful = lock.tryLock();
            System.out.println("Lock successful: " + lockSuccessful);
        } finally {
            lock.unlock();
        }
    }

    private static void tryLockWithFairness() {
        Lock lock = new ReentrantLock(true);
        try {
            boolean lockSuccessful = lock.tryLock(1000, TimeUnit.MILLISECONDS);
            System.out.println("Lock successful: " + lockSuccessful);
        } catch (InterruptedException interruptedException) {
                interruptedException.getMessage();
        } finally {
            lock.unlock();
        }
    }
}
