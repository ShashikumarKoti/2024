package com.skoti.designpatterns.abstractfactory;

public class DeveloperClient {

    public static void main(String[] args) {

        Employee employee1 = EmployeeFactory.getEmployee(new AndroidDeveloperFactory());
        System.out.println(employee1.name() + " & " + employee1.salary());

        Employee employee2 = EmployeeFactory.getEmployee(new WebDeveloperFactory());
        System.out.println(employee2.name() + " & " + employee2.salary());

        Employee employee3 = EmployeeFactory.getEmployee(new DevOpsFactory());
        System.out.println(employee3.name() + " & " + employee3.salary());
    }
}
