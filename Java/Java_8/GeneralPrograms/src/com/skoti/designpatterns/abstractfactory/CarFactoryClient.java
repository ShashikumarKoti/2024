package com.skoti.designpatterns.abstractfactory;

public class CarFactoryClient {

    public static void main(String[] args) {
        CarFactory northAmericanFactory = new NorthAmericanFactory();
        Car nothAmericanCar = northAmericanFactory.createCar();
        CarSpecification northAmericanSpecification = northAmericanFactory.createSpecification();
        nothAmericanCar.assemble();
        northAmericanSpecification.display();

        CarFactory europeanFactory = new EuropeanFactory();
        Car europeanFactoryCar = europeanFactory.createCar();
        CarSpecification europeanFactoryCarSpecification = europeanFactory.createSpecification();
        europeanFactoryCar.assemble();
        europeanFactoryCarSpecification.display();
    }
}
