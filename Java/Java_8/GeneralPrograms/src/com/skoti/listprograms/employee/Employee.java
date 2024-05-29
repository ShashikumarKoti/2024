package com.skoti.listprograms.employee;

import java.util.Objects;

public class Employee {

  private int empId;
  private String name;
  private String dept;
  private Double salary;

  public Employee(int empId, String name, String dept, Double salary) {
    this.empId = empId;
    this.name = name;
    this.dept = dept;
    this.salary = salary;
  }

  public int getEmpId() {
    return empId;
  }

  public void setEmpId(int empId) {
    this.empId = empId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDept() {
    return dept;
  }

  public void setDept(String dept) {
    this.dept = dept;
  }

  public Double getSalary() {
    return salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Employee{"
        + "empId="
        + empId
        + ", name='"
        + name
        + '\''
        + ", dept='"
        + dept
        + '\''
        + ", salary="
        + salary
        + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Employee employee = (Employee) o;
    return Objects.equals(name, employee.name);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(name);
  }
}
