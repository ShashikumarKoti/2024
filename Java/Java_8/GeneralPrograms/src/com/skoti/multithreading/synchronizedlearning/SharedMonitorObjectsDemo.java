package com.skoti.multithreading.synchronizedlearning;

public class SharedMonitorObjectsDemo {
    public static void main(String[] args) {
        Object monitor1 = new Object();
        Object monitor2 = new Object();

        SharedMonitorObjects sharedMonitorObjects1 = new SharedMonitorObjects(monitor1);
        SharedMonitorObjects sharedMonitorObjects2 = new SharedMonitorObjects(monitor1);
        sharedMonitorObjects1.incCounter();
        sharedMonitorObjects2.incCounter();

        SharedMonitorObjects sharedMonitorObjects3 = new SharedMonitorObjects(monitor2);
        sharedMonitorObjects3.incCounter();
    }
}
