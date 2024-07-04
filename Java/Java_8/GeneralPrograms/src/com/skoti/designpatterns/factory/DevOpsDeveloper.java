package com.skoti.designpatterns.factory;

public class DevOpsDeveloper implements Employee {
    @Override
    public double salary() {
        System.out.println("Getting DevOpsDeveloper salary");
        return 70000;
    }
}
