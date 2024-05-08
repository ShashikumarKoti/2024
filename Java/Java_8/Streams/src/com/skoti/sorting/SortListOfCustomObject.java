package com.skoti.sorting;

import com.skoti.foreach.employee.Employee;
import com.skoti.foreach.employee.EmployeeDatabase;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListOfCustomObject {

  public static void main(String[] args) {

    List<Employee> employeeList = new EmployeeDatabase().getEmployeeDetails();
    // legacy approach
    Collections.sort(
        employeeList,
        (employee1, employee2) -> employee2.getSalary().compareTo(employee1.getSalary()));
    System.out.println(employeeList);
    System.out.println("============================================");

    // using streams
    employeeList.stream()
        .sorted((employee1, employee2) -> employee2.getSalary().compareTo(employee1.getSalary()))
        .forEach(System.out::println);
    System.out.println("============================================");

    //optimizing above line
    employeeList.stream().sorted(Comparator.comparing( emp -> emp.getSalary())).forEach(System.out::println)  ;
    System.out.println("============================================");

    //optimizing above line using method reference
    employeeList.stream().sorted(Comparator.comparing(Employee::getName).reversed()).forEach(System.out::println);
  }
}
