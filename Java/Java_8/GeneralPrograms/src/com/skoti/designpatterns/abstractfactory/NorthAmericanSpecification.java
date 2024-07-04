package com.skoti.designpatterns.abstractfactory;

public class NorthAmericanSpecification implements CarSpecification{
    @Override
    public void display() {
        System.out.println("North America Car Specification");
    }
}
