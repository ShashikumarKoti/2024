package com.skoti.designpatterns.singleton;

public class DoubleCheckLazySingletonDemo {

    public static void main(String[] args) {

        DoubleCheckLazySingleton instance1 = DoubleCheckLazySingleton.getInstance();
        System.out.println(instance1.hashCode());

        DoubleCheckLazySingleton instance2 = DoubleCheckLazySingleton.getInstance();
        System.out.println(instance2.hashCode());
    }
}
