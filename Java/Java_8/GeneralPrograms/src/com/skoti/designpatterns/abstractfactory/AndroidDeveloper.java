package com.skoti.designpatterns.abstractfactory;

public class AndroidDeveloper implements Employee {
    @Override
    public double salary() {
        System.out.println("Getting AndroidDeveloper salary");
        return 50000;
    }

    @Override
    public String name() {
        return "I am AndroidDeveloper";
    }
}
