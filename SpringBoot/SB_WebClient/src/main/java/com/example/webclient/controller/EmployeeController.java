package com.example.webclient.controller;

import com.example.webclient.model.AddressResponse;
import com.example.webclient.model.EmployeeResponse;
import com.example.webclient.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees/{id}")
    private ResponseEntity<EmployeeResponse> getEmployeeDetails(@PathVariable("id") int id) {
        EmployeeResponse employee = employeeService.getEmployeeById(id);
        return ResponseEntity.status(HttpStatus.OK).body(employee);
    }

    @GetMapping("/employees")
    private ResponseEntity<List<EmployeeResponse>> getAllEmployees() {
        List<EmployeeResponse> employee = employeeService.getAllEmployees();
        return ResponseEntity.status(HttpStatus.OK).body(employee);
    }
}

