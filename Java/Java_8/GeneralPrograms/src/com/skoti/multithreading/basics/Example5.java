package com.skoti.multithreading.basics;

public class Example5 {

    static class StoppableRunnable implements Runnable {

        private boolean stopRequested = false;

        public synchronized void requestStop() {
            this.stopRequested = true;
        }

        public synchronized boolean isStopRequested() {
            return this.stopRequested;
        }

        private void sleep() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }

        @Override
        public void run() {
            System.out.println("StoppableRunnable running");
            while (!isStopRequested()) {
                sleep();
                System.out.println("*******");
            }
            System.out.println("StoppableRunnable stopped");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        StoppableRunnable stoppableRunnable = new StoppableRunnable();
        Thread thread = new Thread(stoppableRunnable, "StoppableRunnable thread");
        thread.start();

        Thread.sleep(5000);
        System.out.println("Requesting stop from main thread");
        stoppableRunnable.requestStop();
        System.out.println("Stop requested");
    }
}
