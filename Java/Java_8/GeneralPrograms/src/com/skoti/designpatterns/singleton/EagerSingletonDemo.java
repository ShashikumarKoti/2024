package com.skoti.designpatterns.singleton;

public class EagerSingletonDemo {

    public static void main(String[] args) {

        EagerSingleton instance1 = EagerSingleton.getInstance();

        System.out.println(instance1.hashCode());

        EagerSingleton instance2 = EagerSingleton.getInstance();

        System.out.println(instance2.hashCode());


    }
}
