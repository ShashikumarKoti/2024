package com.skoti.method.reference.employee;

import java.util.List;
import java.util.function.Consumer;

public class StaticMethodReferenceEmployeeDemo {

  public static void main(String[] args) {
    // anonymous call approach
    System.out.println("==================anonymous call approach=============================");
    List<Employee> employeeList = EmployeeService.getEmployees();
    employeeList.forEach(
        new Consumer<Employee>() {
          @Override
          public void accept(Employee employee) {
            System.out.println(employee);
          }
        });

    System.out.println("==================lambda approach=============================");
    // lambda approach
    EmployeeService.getEmployees().forEach(employee -> System.out.println(employee));

    System.out.println(
        "===============custom method reference approach================================");
    // custom method reference approach
    EmployeeService.getEmployees().stream().forEach(StaticMethodReferenceEmployeeDemo::print);

    System.out.println(
        "===============predefined method reference approach================================");
    // predefined reference approach
    EmployeeService.getEmployees().stream().forEach(System.out::println);
  }

  public static void print(Employee employee) {
    System.out.println(employee);
  }
}
