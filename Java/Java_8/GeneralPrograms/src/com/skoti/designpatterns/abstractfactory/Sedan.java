package com.skoti.designpatterns.abstractfactory;

public class Sedan implements Car{
    @Override
    public void assemble() {
        System.out.println("Assembling Sedan car.");
    }
}
