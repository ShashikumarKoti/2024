package comparator.functional.interfaces;

import comparator.functional.interfaces.dto.Employee;
import comparator.functional.interfaces.repository.EmployeeRepository;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeComparatorUsingLambda {

  public static void main(String[] args) {

    List<Employee> employeeList = new EmployeeRepository().getEmployees();
    Collections.sort(employeeList, Comparator.comparing(Employee::getFirstName));
    System.out.println(employeeList);

      //using streams
    List<Employee> employeeList2 = new EmployeeRepository().getEmployees();
    List<Employee> employeeSortedList =
        employeeList2.stream()
            .sorted(Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getSalary))
            .collect(Collectors.toList());
    employeeSortedList.stream().forEach(System.out::println);
  }
}
