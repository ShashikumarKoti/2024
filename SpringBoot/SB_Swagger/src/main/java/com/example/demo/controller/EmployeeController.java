package com.example.demo.controller;

import com.example.demo.model.Employee;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeController {

    @Tag(name = "get", description = "GET methods of Employee APIs")
    @GetMapping("/employees")
    public List<Employee> findAllEmployees() {
        return Arrays.asList(new Employee("Shashi", "Koti"), new Employee("Ved","Koti"));
    }

    @Tag(name = "get", description = "GET methods of Employee APIs")
    @GetMapping("/employees/{empID}")
    public List<Employee> findEmployeeByID(@Parameter(
            description = "ID of employee to be retrieved",
            required = true) @PathVariable("empID") int empID) {
        return Arrays.asList(new Employee("Shashi", "Koti"), new Employee("Ved","Koti"));
    }

    @Operation(summary = "Update an employee",
            description = "Update an existing employee. The response is updated Employee object with id, first name, and last name.")
    @PostMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employee;
    }

    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(mediaType = "application/json",
                    schema = @Schema(implementation = Employee.class)) }),
            @ApiResponse(responseCode = "404", description = "Employee not found",
                    content = @Content)
    })
    @PutMapping("/employee/{empId}")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employee;
    }


    @ApiResponses({
           @ApiResponse(responseCode = "200", content = {
                   @Content(mediaType = "application/json",
                           schema = @Schema(implementation = Employee.class))
           }) ,
           @ApiResponse(
                   responseCode = "400", description = "Not found", content = @Content)
    })
    @DeleteMapping("/employee/{empId}")
    public void deleteEm() {

    }



}