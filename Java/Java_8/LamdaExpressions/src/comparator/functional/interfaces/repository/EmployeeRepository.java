package comparator.functional.interfaces.repository;

import comparator.functional.interfaces.dto.Employee;

import java.util.Arrays;
import java.util.List;

public class EmployeeRepository {

  public List<Employee> getEmployees() {
    return Arrays.asList(
        new Employee("Shashi", "Kumar", 4000.0),
        new Employee("Antony", "Amar", 7000.0),
        new Employee("Antony", "Kumar", 9000.0),
        new Employee("Wasim", "Devi", 8000.0));
  }
}
