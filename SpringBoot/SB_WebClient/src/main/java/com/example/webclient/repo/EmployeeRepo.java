package com.example.webclient.repo;

import com.example.webclient.model.Employee;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;

public class EmployeeRepo {

    public static Flux<Employee> getAllEmployees() {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "Shashi", "sk@gmail.com", 35),
                new Employee(2, "Ashfaq", "ma@gmail.com", 36),
                new Employee(3, "Jayraj", "jkm@gmail.com", 33)
        );
        return Flux.fromIterable(employeeList);
    }

    public static Employee getEmployeeById(int id) {
        return switch (id) {
            case 1 -> new Employee(1, "Shashi", "sk@gmail.com", 35);
            case 2 -> new Employee(2, "Ashfaq", "ma@gmail.com", 36);
            case 3 -> new Employee(3, "Jayraj", "jkm@gmail.com", 33);
            default -> new Employee();
        };
    }
}
