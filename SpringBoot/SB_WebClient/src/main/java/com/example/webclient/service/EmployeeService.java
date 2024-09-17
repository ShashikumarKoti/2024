package com.example.webclient.service;

import com.example.webclient.model.AddressResponse;
import com.example.webclient.model.Employee;
import com.example.webclient.model.EmployeeResponse;
import com.example.webclient.repo.EmployeeRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.Disposable;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.stream.Stream;

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
        employeeResponse.setAddressResponse(addressResponse);

        return employeeResponse;
    }

    public Flux<EmployeeResponse> getAllEmployees() {
        Flux<Employee> employeeList = EmployeeRepo.getAllEmployees();
        List<EmployeeResponse> employeeResponseList = employeeList.toStream().map(emp -> modelMapper.map(emp, EmployeeResponse.class)).toList();

        List<AddressResponse> addressResponseList = webClient.get()
                .uri("/addresses")
                .retrieve()
                .bodyToFlux(AddressResponse.class)
                .collectList()
                .block();

        employeeResponseList.forEach(
                emp -> {
                    emp.setAddressResponse(
                            addressResponseList.stream().filter( address -> address.getId()==emp.getId()).findAny().get());
                }
        );
        return Flux.fromIterable(employeeResponseList);
    }
}
