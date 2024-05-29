package com.skoti.listprograms.employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class EmployeeDatabase {

    public List<Employee> getEmployeeDetails() {
        return Arrays.asList(
                new Employee(176, "Shashikumar", "Dev", 50000.0),
                new Employee(259, "Shwetha", "Test", 30000.0),
                new Employee(547, "Ved", "Fresher", 50000.0),
                new Employee(653, "Sassy", "Fresher", 30000.0));
    }

    public List<Employee> getEmployeeDetailsWithDuplicates() {
        return Arrays.asList(
                new Employee(176, "Shashikumar", "Dev", 50000.0),
                new Employee(259, "Shwetha", "Test", 30000.0),
                new Employee(547, "Shashikumar", "Fresher", 50000.0),
                new Employee(653, "Sassy", "Fresher", 30000.0));
    }

    public List<Employee> getEmployeeDetailsWithDuplicateDepartments() {
        return Arrays.asList(
                new Employee(176, "Shashikumar", "IT", 50000.0),
                new Employee(259, "Shwetha", "ADMIN", 25000.0),
                new Employee(547, "Shashikumar", "IT", 30000.0),
                new Employee(653, "Sassy", "ADMIN", 45000.0));
    }

    public List<Employee> getManyEmployeeDetails() {
        List<Employee> employeeList = new ArrayList<>();
        for (int i = 0; i <= 1000; i++) {
            employeeList.add(new Employee(i, "employee"+i, "A", Double.valueOf(new Random().nextInt(1000 * 100))));
        }
        return employeeList;
    }
}
