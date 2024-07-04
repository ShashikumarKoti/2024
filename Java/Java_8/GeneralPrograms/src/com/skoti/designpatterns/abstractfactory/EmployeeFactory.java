package com.skoti.designpatterns.abstractfactory;

public class EmployeeFactory {

    //create employee
    public static Employee getEmployee(EmployeeAbstractFactory employeeAbstractFactory) {
        return employeeAbstractFactory.createEmployee();
    }
}
