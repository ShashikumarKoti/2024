package com.skoti.collectors;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingByExample {

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

        //approach 1
        Map<Department, List<Employee>> departmentListMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println("Approach 1: Employees grouped by department");
        departmentListMap.forEach(
                (Department department, List<Employee> employeeList) ->
                        System.out.println("Department: " + department + " : " + employeeList)
        );

        //approach 2
        System.out.println("Approach 2: Employees grouped by department");
        Map<Department, Set<Employee>> departmentSetMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.toSet()));
        departmentSetMap.forEach(
                (Department department, Set<Employee> employeeSet) ->
                        System.out.println("Department Set: " + department + " : " + employeeSet)
        );

        //approach 3
        System.out.println("Approach 3: Employees sorted grouped by department ");
        TreeMap<Department, Set<Employee>> departmentSetTreeMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, TreeMap::new, Collectors.toSet()));
        departmentSetTreeMap.forEach(
                (Department department, Set<Employee> employeeSet) -> System.out.println("Department TreeMap: " + department + " : " + employeeSet)
        );

    }
}
