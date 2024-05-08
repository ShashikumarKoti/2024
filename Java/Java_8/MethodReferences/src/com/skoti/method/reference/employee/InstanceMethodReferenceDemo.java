package com.skoti.method.reference.employee;

import java.util.List;
import java.util.stream.Collectors;

public class InstanceMethodReferenceDemo {

  public static void main(String[] args) {
    List<EmployeeDAO> employeeDAOS =
        EmployeeService.getEmployees().stream()
            .map(new EmployeeMapper()::convertEmpObjectViaInstance)
            .collect(Collectors.toList());
    System.out.println(employeeDAOS);

    /*
    requirement 2 : to get employee names from list of employees via method reference
    Note: while using map in below code, though getName() is instance method, we are still able to access via class name i.e, Employee::getName
    This is because, map() takes Function as param...and Function has input and output as params.....and if that input is not having any argument, then it is considered as static method.Therefore we should be able to access it via class name Employee
    getName() is having no argument
     */
    List<String> employeesNameList =
        EmployeeService.getEmployees().stream().map(Employee::getName).collect(Collectors.toList());
    System.out.println(employeesNameList);
  }
}
