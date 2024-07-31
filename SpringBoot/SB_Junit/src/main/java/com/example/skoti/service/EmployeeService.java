package com.example.skoti.service;

import com.example.skoti.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    Employee saveEmployee(Employee employee) throws Exception;

    List<Employee> getAllEmployees();

    Optional<Employee> getEmployeeByID(long empID);

    Employee updateEmployee(Employee employee);

    void deleteEmployee(long empID);
}
