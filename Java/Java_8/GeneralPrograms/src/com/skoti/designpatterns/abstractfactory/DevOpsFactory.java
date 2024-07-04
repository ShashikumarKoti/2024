package com.skoti.designpatterns.abstractfactory;

public class DevOpsFactory extends EmployeeAbstractFactory {
    @Override
    public Employee createEmployee() {
        return new DevOpsDeveloper();
    }
}
