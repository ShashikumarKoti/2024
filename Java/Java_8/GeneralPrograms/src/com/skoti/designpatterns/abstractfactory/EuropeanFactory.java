package com.skoti.designpatterns.abstractfactory;

public class EuropeanFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new HatchBack();
    }

    @Override
    public CarSpecification createSpecification() {
        return new EuropeanSpecification();
    }
}
