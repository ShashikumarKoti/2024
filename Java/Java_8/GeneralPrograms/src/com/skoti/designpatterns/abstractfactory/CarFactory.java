package com.skoti.designpatterns.abstractfactory;

public interface CarFactory {

    Car createCar();

    CarSpecification createSpecification();
}
