package com.skoti.multithreading.synchronizedlearning;

public class MixedSynchronization {

    public static Object staticObject = null;
    public Object instanceObject = null;

    public static synchronized void setObject(Object object) {
            staticObject = object;
    }

    public synchronized void setInstanceObject(Object o) {
        this.instanceObject = o;
    }
}
