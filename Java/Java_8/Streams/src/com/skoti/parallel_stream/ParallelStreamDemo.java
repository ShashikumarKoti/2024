package com.skoti.parallel_stream;

import com.skoti.foreach.employee.Employee;
import com.skoti.foreach.employee.EmployeeDatabase;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamDemo {

    public static void main(String[] args) {

        long start = 0;
        long end = 0;
        start = System.currentTimeMillis();
        IntStream.range(1, 1000).forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println("Plain stream took :" + (end - start));

        System.out.println("======================================");

        start = System.currentTimeMillis();
        IntStream.range(1, 1000).parallel().forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println("Parallel stream took :" + (end - start));

        //to demonstrate parallel stream executes in different cores
        IntStream.range(1, 10).forEach(thread -> System.out.println("Thread name: " + Thread.currentThread().getName() + " " + thread));

        IntStream.range(1, 10).parallel().forEach(thread -> System.out.println("Thread name: " + Thread.currentThread().getName() + " " + thread));

        List<Employee> manyEmployeeDetails = new EmployeeDatabase().getManyEmployeeDetails();
        start = System.currentTimeMillis();
        double averageSalaryUsingStreams = manyEmployeeDetails.stream().map(Employee::getSalary).mapToDouble(salary -> salary).average().getAsDouble();
        end = System.currentTimeMillis();
        System.out.println("Normal stream took :" + (end - start) + " avg salary is " + averageSalaryUsingStreams);

        start = System.currentTimeMillis();
        double averageSalaryUsingParallelStreams = manyEmployeeDetails.parallelStream().map(Employee::getSalary).mapToDouble(salary -> salary).average().getAsDouble();
        end = System.currentTimeMillis();
        System.out.println("Parallel stream took :" + (end - start) + " avg salary is " + averageSalaryUsingParallelStreams);
    }
}
