package com.skoti.foreach.employee;

import java.util.Arrays;
import java.util.List;

public class EmployeeDatabase {

  public List<Employee> getEmployeeDetails() {
    return Arrays.asList(
        new Employee(176, "Shashikumar", "Dev", 3000000.0),
        new Employee(259, "Shwetha", "Test", 2000000.0),
        new Employee(547, "Nitin", "Fresher", 500000.0),
        new Employee(653, "Advith", "Fresher", 300000.0));
  }
}
