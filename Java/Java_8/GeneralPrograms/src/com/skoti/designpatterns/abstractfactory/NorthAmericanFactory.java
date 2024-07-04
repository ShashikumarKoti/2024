package com.skoti.designpatterns.abstractfactory;

public class NorthAmericanFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Sedan();
    }

    @Override
    public CarSpecification createSpecification() {
        return new NorthAmericanSpecification();
    }
}
