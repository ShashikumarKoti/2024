package com.skoti.map_reduce;

public class MapReduceEmployeeDemo {
  public static void main(String[] args) {
    // Requirement 1
    // get employee with grade A
    // get Salary of those employees
    // find average salary
    double averageSalary =
        EmployeeDatabase.getEmployeeDetails().stream()
            .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
            .map(employee -> employee.getSalary())
            .mapToDouble(salary -> salary)
            .average()
            .getAsDouble();

    System.out.println(averageSalary);

    // Requirement2
    // get employees with grade B
    // get Salary of those employees
    // find sum of there salaries
    double sumOfSalariesOfGradeB =
        EmployeeDatabase.getEmployeeDetails().stream()
            .filter(employee -> employee.getGrade().equalsIgnoreCase("B"))
            .map(employee -> employee.getSalary())
            .mapToDouble(salary -> salary)
            .sum();
    System.out.println(sumOfSalariesOfGradeB);
  }
}
