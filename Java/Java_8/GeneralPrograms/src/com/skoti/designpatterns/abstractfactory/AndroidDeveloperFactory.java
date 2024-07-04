package com.skoti.designpatterns.abstractfactory;

public class AndroidDeveloperFactory extends EmployeeAbstractFactory {
    @Override
    public Employee createEmployee() {
        return new AndroidDeveloper();
    }
}
