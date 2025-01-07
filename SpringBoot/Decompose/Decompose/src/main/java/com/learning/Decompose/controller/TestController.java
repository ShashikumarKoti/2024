package com.learning.Decompose.controller;

import com.learning.Decompose.servide.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping("v1/app")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/appications")
    public ResponseEntity<List<String>> getApplications() {
        List<String> applications = testService.getApplications();
        return new ResponseEntity<>(applications, CREATED);
    }

    @GetMapping("/appicationsExp")
    public ResponseEntity<List<String>> getApplicationsWithException() {
        List<String> applications = List.of();
        applications = testService.getApplicationsWithExp();
        return new ResponseEntity<>(applications, CREATED);
    }
}
