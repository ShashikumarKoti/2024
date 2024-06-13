package com.skoti.listprograms;

import com.skoti.listprograms.employee.Employee;
import com.skoti.listprograms.employee.EmployeeDatabase;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElementsInList {

    public static void main(String[] args) {

        System.out.println("Find duplicate items");
        List<String> employeesNameList = new EmployeeDatabase().getEmployeeDetailsWithDuplicates().stream().map(Employee::getName).collect(Collectors.toList());
        System.out.println(employeesNameList);
        Set<String> employeeSet = new HashSet<>();
        Set<String> duplicateEmployees = employeesNameList.stream().filter(empName -> !employeeSet.add(empName)).collect(Collectors.toSet());
        System.out.println(duplicateEmployees);
    }
}
