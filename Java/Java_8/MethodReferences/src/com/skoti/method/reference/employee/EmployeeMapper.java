package com.skoti.method.reference.employee;

public class EmployeeMapper {

  public static EmployeeDAO convertEmpObject(Employee employee) {
    EmployeeDAO employeeDAO = new EmployeeDAO();
    employeeDAO.setId(employee.getId());
    employeeDAO.setName(employee.getName());
    employeeDAO.setSalary(employee.getSalary());
    return employeeDAO;
  }

  public EmployeeDAO convertEmpObjectViaInstance(Employee employee) {
    EmployeeDAO employeeDAO = new EmployeeDAO();
    employeeDAO.setId(employee.getId());
    employeeDAO.setName(employee.getName());
    employeeDAO.setSalary(employee.getSalary());
    return employeeDAO;
  }
}
