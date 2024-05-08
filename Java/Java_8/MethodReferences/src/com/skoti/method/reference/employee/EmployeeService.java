package com.skoti.method.reference.employee;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EmployeeService {

  public static List<Employee> getEmployees() {
    return IntStream.rangeClosed(1, 10)
        .mapToObj(obj -> new Employee(obj, "employee_" + obj, new Random().nextInt(50000)))
        .collect(Collectors.toList());
  }
}
