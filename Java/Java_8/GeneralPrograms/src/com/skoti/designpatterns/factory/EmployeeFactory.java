package com.skoti.designpatterns.factory;

public class EmployeeFactory {

    //get employee
    public static Employee getEmployee(String employeeType) {
        return switch (employeeType) {
            case "ANDROID" -> new AndroidDeveloper();
            case "BACKEND" -> new BackendDeveloper();
            case "DEVOPS" -> new DevOpsDeveloper();
            default -> null;
        };
    }
}
