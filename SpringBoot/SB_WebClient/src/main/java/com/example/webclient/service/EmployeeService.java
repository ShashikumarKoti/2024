package com.example.webclient.service;

import com.example.webclient.model.AddressResponse;
import com.example.webclient.model.Employee;
import com.example.webclient.model.EmployeeResponse;
import com.example.webclient.repo.EmployeeRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    @Autowired
    private WebClient webClient;

    @Autowired
    private ModelMapper modelMapper;

    public EmployeeResponse getEmployeeById(int id) {
        Employee employeeById = EmployeeRepo.getEmployeeById(id);
        EmployeeResponse employeeResponse = modelMapper.map(employeeById, EmployeeResponse.class);

        AddressResponse addressResponse = webClient.get().uri("/address/" + id).retrieve().bodyToMono(AddressResponse.class).block();
        for (int i=0;i<100;i++) {
            System.out.println("Continuing flow "  +i);
        }
        employeeResponse.setAddressResponse(addressResponse);

        return employeeResponse;
    }

    public List<EmployeeResponse> getAllEmployees() {
        List<Employee> employeeList = EmployeeRepo.getAllEmployees();
        List<EmployeeResponse> employeeResponseList = employeeList.stream().
                map(emp -> modelMapper.map(emp, EmployeeResponse.class)).toList();
        List<AddressResponse> addressResponseList = webClient.get()
                .uri("/addresses")
                .retrieve()
                .bodyToFlux(AddressResponse.class)
                .collectList()
                .block();

        employeeResponseList.forEach(
                employee -> {
                    assert addressResponseList != null;
                    employee.setAddressResponse(
                            addressResponseList.stream().filter( address -> address.getId()==employee.getId()).findAny().get());
                }
        );

        return employeeResponseList;
    }
}
