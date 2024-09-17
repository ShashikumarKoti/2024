package com.example.webclient.controller;

import com.example.webclient.model.AddressResponse;
import com.example.webclient.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/address/{employeeId}")
    public ResponseEntity<AddressResponse> getAddressByEmployeeId(@PathVariable("employeeId") int employeeId)  {
        AddressResponse addressResponse = addressService.findAddressByEmpId(employeeId);
        return ResponseEntity.status(HttpStatus.OK).body(addressResponse);

    }


    @GetMapping("/addresses")
    public ResponseEntity<List<AddressResponse>> getAllAddresses() {
        List<AddressResponse> addressResponse = addressService.findAllAddress();
        return ResponseEntity.status(HttpStatus.OK).body(addressResponse);

    }
}

