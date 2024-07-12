package com.skoti.multithreading.synchronizedlearning;

public class MultipleMonitorObjects {

    private Object object1 = new Object();
    private Object object2 = new Object();

    private int counter1 = 0;
    private int counter2 = 0;

    public void incCounter1() {
        synchronized (this.object1) {
            this.counter1 ++;
        }
    }

    public void incCounter2() {
        synchronized (this.object2) {
            this.counter2 ++;
        }
    }
}
