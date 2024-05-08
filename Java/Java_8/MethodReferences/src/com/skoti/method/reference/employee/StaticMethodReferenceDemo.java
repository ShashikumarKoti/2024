package com.skoti.method.reference.employee;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StaticMethodReferenceDemo {

  public static void main(String[] args) {

    // anonymous call
    System.out.println("==================anonymous call approach=============================");
    List<EmployeeDAO> employeeDAOS =
        EmployeeService.getEmployees().stream()
            .map(
                new Function<Employee, EmployeeDAO>() {

                  @Override
                  public EmployeeDAO apply(Employee employee) {
                    EmployeeDAO employeeDAO = new EmployeeDAO();
                    employeeDAO.setId(employee.getId());
                    employeeDAO.setName(employee.getName());
                    employeeDAO.setSalary(employee.getSalary());
                    return employeeDAO;
                  }
                })
            .collect(Collectors.toList());
    System.out.println(employeeDAOS);

    // using lambda
    System.out.println("==================lambda approach=============================");
    List<EmployeeDAO> employeeDAOS2 =
        EmployeeService.getEmployees().stream()
            .map(
                employee -> {
                  EmployeeDAO employeeDAO = new EmployeeDAO();
                  employeeDAO.setId(employee.getId());
                  employeeDAO.setName(employee.getName());
                  employeeDAO.setSalary(employee.getSalary());
                  return employeeDAO;
                })
            .collect(Collectors.toList());
    System.out.println(employeeDAOS2);

    System.out.println("===============lambda approach2================================");
    List<EmployeeDAO> employeeDAOS3 =
        EmployeeService.getEmployees().stream()
            .map(employee -> EmployeeMapper.convertEmpObject(employee))
            .collect(Collectors.toList());
    System.out.println(employeeDAOS3);

    // using method reference
    System.out.println("===============method reference approach================================");
    List<EmployeeDAO> employeeDAOS4 =
        EmployeeService.getEmployees().stream()
            .map(EmployeeMapper::convertEmpObject)
            .collect(Collectors.toList());
    System.out.println(employeeDAOS4);
  }
}
