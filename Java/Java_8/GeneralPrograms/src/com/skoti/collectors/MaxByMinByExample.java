package com.skoti.collectors;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxByMinByExample {

    static List<Employee> employeeList
            = Arrays.asList(new Employee("Tom Jones", 45, 15000.00),
            new Employee("Tom Jones", 45, 7000.00),
            new Employee("Ethan Hardy", 65, 8000.00),
            new Employee("Nancy Smith", 22, 10000.00),
            new Employee("Deborah Sprightly", 29, 9000.00));


    public static void main(String[] args) {

        Optional<Employee> maxSalaryEmp  = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
        System.out.println("Max salary : " + (maxSalaryEmp.isPresent() ? maxSalaryEmp.get() : "Not applicable"));


        Optional<Employee> minAgeEmp = employeeList.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getAge)));
        System.out.println("Min age : " + (minAgeEmp.isPresent() ? minAgeEmp.get() : "Not applicable"));

    }
}
