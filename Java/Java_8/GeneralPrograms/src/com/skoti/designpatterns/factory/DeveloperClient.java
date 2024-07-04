package com.skoti.designpatterns.factory;

import java.util.Objects;

public class DeveloperClient {

    public static void main(String[] args) {

        Employee employee = EmployeeFactory.getEmployee("DEVOPS");
        if(!Objects.isNull(employee))
            System.out.println(employee.salary());
    }
}
