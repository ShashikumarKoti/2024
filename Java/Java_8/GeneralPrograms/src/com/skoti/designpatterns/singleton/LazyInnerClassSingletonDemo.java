package com.skoti.designpatterns.singleton;

public class LazyInnerClassSingletonDemo {

    public static void main(String[] args) {

        LazyInnerClassSingleton lazyInnerClassSingleton1 = LazyInnerClassSingleton.getInstance();
        System.out.println(lazyInnerClassSingleton1.hashCode());

        LazyInnerClassSingleton lazyInnerClassSingleton2 = LazyInnerClassSingleton.getInstance();
        System.out.println(lazyInnerClassSingleton2.hashCode());
    }
}
