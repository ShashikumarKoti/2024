package com.skoti.multithreading.virtualthreads;

public class VirtualThreadExample1 {

    public static void main(String[] args) {

        //Approach:1 Create Runnable. Create and start virtual thread
        Runnable runnable = () -> {
            for (int i=0;i<10;i++) {
                System.out.println("Index: "+ i);
            }
        };
        Thread virtualStartedThread = Thread.ofVirtual().start(runnable);


        //Approach:2 Create Runnable. Create but do not start virtual thread
        Thread virtualUnstartedThread = Thread.ofVirtual().unstarted(runnable);
        virtualUnstartedThread.start();

        try {
            virtualUnstartedThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
