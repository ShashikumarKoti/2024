package com.skoti.designpatterns.factory;

public class AndroidDeveloper implements Employee {
    @Override
    public double salary() {
        System.out.println("Getting AndroidDeveloper salary");
        return 50000;
    }
}
