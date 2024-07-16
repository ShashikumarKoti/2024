package com.skoti.multithreading.threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class CustomThreadPool {

    private BlockingQueue<Runnable> taskQueue = null;
    private List<PoolThreadRunnable> runnables = new ArrayList<>();
    private boolean isStopped = false;

    public CustomThreadPool(int numOfThreads, int maxNumOfTasks) {
        taskQueue = new ArrayBlockingQueue<>(maxNumOfTasks);
        for (int i = 0; i < numOfThreads; i++) {
            PoolThreadRunnable poolThreadRunnable = new PoolThreadRunnable(taskQueue);
            runnables.add(poolThreadRunnable);
        }
        for (PoolThreadRunnable runnable : runnables) {
            new Thread(runnable).start();
        }
    }

    public synchronized void execute(Runnable task) {
        if (this.isStopped) {
            throw new IllegalStateException("ThreadPool is stopped");
        }
        this.taskQueue.offer(task);
    }

    public synchronized void stop() {
        this.isStopped = true;
        for (PoolThreadRunnable runnable : runnables){
            runnable.doStop();
        }
    }

    public synchronized void waitUntilAllTasksFinished() {
        while (!this.taskQueue.isEmpty()) {
            try {
                Thread.sleep(1);
            }catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
    }
}


class PoolThreadRunnable implements Runnable {

    private Thread thread = null;
    private BlockingQueue<Runnable> taskQueue = null;
    private boolean isStopped = false;

    public PoolThreadRunnable(BlockingQueue<Runnable> blockingQueue) {
        taskQueue = blockingQueue;
    }

    @Override
    public void run() {
        this.thread = Thread.currentThread();
        while (!isStopped) {
            try {
                Runnable runnable = taskQueue.take();
                runnable.run();
            } catch (Exception exception) {
                //
            }
        }
    }

    public synchronized void doStop() {
        isStopped = true;
        //break pool thread out of dequeue() call.
        this.thread.interrupt();
    }

    public synchronized boolean isStopped() {
        return isStopped;
    }
}