package com.skoti.foreach.employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class EmployeeDatabase {

    public List<Employee> getEmployeeDetails() {
        return Arrays.asList(
                new Employee(176, "Shashikumar", "Dev", 3000000.0),
                new Employee(259, "Shwetha", "Test", 2000000.0),
                new Employee(547, "Nitin", "Fresher", 500000.0),
                new Employee(653, "Advith", "Fresher", 300000.0));
    }

    public List<Employee> getManyEmployeeDetails() {
        List<Employee> employeeList = new ArrayList<>();
        for (int i = 0; i <= 1000; i++) {
            employeeList.add(new Employee(i, "employee"+i, "A", Double.valueOf(new Random().nextInt(1000 * 100))));
        }
        return employeeList;
    }
}
