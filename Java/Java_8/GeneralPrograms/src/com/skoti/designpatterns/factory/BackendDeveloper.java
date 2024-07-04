package com.skoti.designpatterns.factory;

public class BackendDeveloper implements Employee{
    @Override
    public double salary() {
        System.out.println("Getting BackendDeveloper salary");
        return 60000;
    }
}
