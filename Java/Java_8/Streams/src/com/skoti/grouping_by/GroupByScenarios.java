package com.skoti.grouping_by;

import com.skoti.foreach.employee.Employee;
import com.skoti.foreach.employee.EmployeeDatabase;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class GroupByScenarios {

    public static void main(String[] args) {

        List<Employee> employeeDetails = new EmployeeDatabase().getEmployeeDetails();

        employeeDetails.stream().collect(Collectors.groupingBy(Employee::getSalary))
                .entrySet().stream().forEach(key -> System.out.println(key.getKey() + "====" + key.getValue()));


        System.out.println("=============================================");


        new EmployeeDatabase().getEmployeeDetailsWithDuplicates().stream()
                .collect(Collectors.groupingBy(Employee::getSalary, Collectors.toSet())).entrySet().stream()
                .forEach(key -> System.out.println(key.getKey() + "=====" + key.getValue()));

        System.out.println("=============================================");

        new EmployeeDatabase().getEmployeeDetails().stream()
                .collect(Collectors.groupingBy(Employee::getSalary, TreeMap::new, Collectors.toList())).forEach((key,value) ->
                        System.out.println(key + "====" + value));

        System.out.println("=============================================");
        new EmployeeDatabase().getEmployeeDetails().stream().map(Employee::getName).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("=============================================");
        new EmployeeDatabase().getEmployeeDetailsWithDuplicates().stream().map(Employee::getName).collect(Collectors.toSet()).forEach(System.out::println);
        System.out.println("=============================================");
        new EmployeeDatabase().getEmployeeDetailsWithDuplicates().stream().map(Employee::getName).collect(Collectors.toCollection(TreeSet::new)).forEach(System.out::println);
        System.out.println("=============================================");
        String concatinatedString = new EmployeeDatabase().getEmployeeDetails().stream().map(Employee::getName).collect(Collectors.joining(", "));
        System.out.println(concatinatedString);
        System.out.println("=============================================");
        Double sumOfSalary = new EmployeeDatabase().getEmployeeDetails().stream().collect(Collectors.summingDouble(Employee::getSalary));
        System.out.println(sumOfSalary);
        System.out.println("=============================================");
        Map<String, Double> groupByDeptAndCalculateSalary = new EmployeeDatabase().getEmployeeDetailsWithDuplicateDepartments().stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.summingDouble(Employee::getSalary)));
        System.out.println(groupByDeptAndCalculateSalary);
        System.out.println("=============================================");
        Map<Boolean, List<Employee>> booleanListMap = new EmployeeDatabase().getEmployeeDetailsWithDuplicateDepartments().stream().collect(Collectors.partitioningBy(type -> type.getSalary() > 30000.0));
        System.out.println(booleanListMap);
        System.out.println("=============================================");
        Long collect = new EmployeeDatabase().getEmployeeDetails().stream().collect(Collectors.counting());
        System.out.println(collect);
        System.out.println("=============================================");
    }
}
