package com.skoti.listprograms.employee;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {
  public static void main(String[] args) {

    System.out.println(evaluateTaxPayers("no tax"));
  }

  public static List<Employee> evaluateTaxPayers(String isTaxable) {
    List<Employee> employeeDetails = new EmployeeDatabase().getEmployeeDetails();

    // if else legacy approach
    /*
    if (isTaxable.equalsIgnoreCase("tax")) {
        return employeeDetails.stream()
            .filter(employee -> employee.getSalary() > 500000.0)
            .collect(Collectors.toList());
      } else {
        return employeeDetails.stream()
            .filter(employee -> employee.getSalary() <= 500000.0)
            .collect(Collectors.toList());
      }

     */

    // if else refactored to ternary operator
    return (isTaxable.equalsIgnoreCase("tax"))
        ? employeeDetails.stream()
            .filter(employee -> employee.getSalary() > 500000.0)
            .collect(Collectors.toList())
        : employeeDetails.stream()
            .filter(employee -> employee.getSalary() <= 500000.0)
            .collect(Collectors.toList());
  }
}
