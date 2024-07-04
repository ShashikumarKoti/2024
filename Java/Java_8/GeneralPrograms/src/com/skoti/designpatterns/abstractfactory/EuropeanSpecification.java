package com.skoti.designpatterns.abstractfactory;

public class EuropeanSpecification implements CarSpecification{
    @Override
    public void display() {
        System.out.println("European Car Specification");
    }
}
