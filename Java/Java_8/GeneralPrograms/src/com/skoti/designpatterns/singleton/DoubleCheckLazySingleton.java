package com.skoti.designpatterns.singleton;

public class DoubleCheckLazySingleton {

    private DoubleCheckLazySingleton() {
    }

    private static DoubleCheckLazySingleton instance;

    public static DoubleCheckLazySingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckLazySingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckLazySingleton();
                }
            }
        }
        return instance;
    }
}
