package com.skoti.designpatterns.abstractfactory;

public class DevOpsDeveloper implements Employee {
    @Override
    public double salary() {
        System.out.println("Getting DevOpsDeveloper salary");
        return 70000;
    }

    @Override
    public String name() {
        return "I am DevOpsDeveloper";
    }
}
