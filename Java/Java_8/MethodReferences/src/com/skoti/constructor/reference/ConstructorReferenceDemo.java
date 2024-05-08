package com.skoti.constructor.reference;

import com.skoti.method.reference.employee.Employee;
import com.skoti.method.reference.employee.EmployeeService;

import java.util.ArrayList;

public class ConstructorReferenceDemo {

  // constructor reference can be used  only for Functional interfaces
  public static void main(String[] args) {

    // lambda approach
    EmployeeManager employeeManager = () -> new Employee(101, "testEmployee", 1111.1D);
    employeeManager.getEmployee().getEmployeeInfo();

    // using constructor reference
    EmployeeManager employeeManager1 = Employee::new;
    employeeManager1.getEmployee().getEmployeeInfo();

    EmployeeService.getEmployees().stream().map(Employee::getId).map(ArrayList::new).forEach(System.out::println);
  }
}
