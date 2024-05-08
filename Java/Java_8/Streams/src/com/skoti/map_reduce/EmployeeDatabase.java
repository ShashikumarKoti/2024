package com.skoti.map_reduce;

import java.util.Arrays;
import java.util.List;

public class EmployeeDatabase {

  public static List<Employee> getEmployeeDetails() {
    return Arrays.asList(
        new Employee(176, "Shashikumar", "A", 3000000.0),
        new Employee(259, "Shwetha", "B", 2000000.0),
        new Employee(547, "Nitin", "A", 500000.0),
        new Employee(653, "Advith", "C", 300000.0),
        new Employee(278, "Naman", "B", 1000000.0));
  }
}
