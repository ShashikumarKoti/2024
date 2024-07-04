package com.skoti.designpatterns.abstractfactory;

public class WebDeveloperFactory extends EmployeeAbstractFactory {
    @Override
    public Employee createEmployee() {
        return new BackendDeveloper();
    }
}
