package com.skoti.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountingExample {

    static List<Employee> employeeList = Arrays.asList(
            new Employee("Tom Jones", 45, 12000.00, Department.MARKETING),
            new Employee("Harry Major", 26, 20000.00, Department.LEGAL),
            new Employee("Ethan Hardy", 65, 30000.00, Department.LEGAL),
            new Employee("Nancy Smith", 22, 15000.00, Department.MARKETING),
            new Employee("Catherine Jones", 21, 18000.00, Department.HR),
            new Employee("James Elliot", 58, 24000.00, Department.OPERATIONS),
            new Employee("Frank Anthony", 55, 32000.00, Department.MARKETING),
            new Employee("Michael Reeves", 40, 45000.00, Department.OPERATIONS));

    public static void main(String[] args) {


        Long employeesListCount = employeeList.stream().collect(Collectors.counting());
        System.out.println(employeesListCount);

       System.out.println( employeeList.size());
    }
}
