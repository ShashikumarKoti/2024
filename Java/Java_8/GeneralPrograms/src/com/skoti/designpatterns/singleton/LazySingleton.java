package com.skoti.designpatterns.singleton;

public class LazySingleton {

    private LazySingleton() {

    }

    private static LazySingleton instance;

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            return instance = new LazySingleton();
        }
        return instance;
    }
}
