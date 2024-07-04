package com.skoti.designpatterns.abstractfactory;

public class BackendDeveloper implements Employee {
    @Override
    public double salary() {
        System.out.println("Getting BackendDeveloper salary");
        return 60000;
    }

    @Override
    public String name() {
        return "I am BackendDeveloper";
    }
}
