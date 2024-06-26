package com.skoti.map_reduce;

public class Employee {

  private int id;
  private String name;
  private String grade;
  private Double salary;

  public Employee(int id, String name, String grade, Double salary) {
    this.id = id;
    this.name = name;
    this.grade = grade;
    this.salary = salary;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGrade() {
    return grade;
  }

  public void setGrade(String grade) {
    this.grade = grade;
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
        + "id="
        + id
        + ", name='"
        + name
        + '\''
        + ", grade='"
        + grade
        + '\''
        + ", salary="
        + salary
        + '}';
  }
}
