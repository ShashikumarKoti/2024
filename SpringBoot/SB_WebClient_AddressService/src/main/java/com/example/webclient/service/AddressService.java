package com.example.webclient.service;

import com.example.webclient.model.Address;
import com.example.webclient.model.AddressResponse;
import com.example.webclient.repo.AddressRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressService {

    @Autowired
    private ModelMapper modelMapper;

    public AddressResponse findAddressByEmpId(int empId) throws InterruptedException {
        Address addressByEmpId = AddressRepo.findAddressByEmpId(empId);
        Thread.sleep(5000);
        return modelMapper.map(addressByEmpId, AddressResponse.class);
    }

    public List<AddressResponse> findAllAddress() {
        List<Address> addressList = AddressRepo.findAllAddresses();
        List<AddressResponse> addressResponseList = new ArrayList<>();
        for (Address address: addressList) {
            AddressResponse addressResponse = modelMapper.map(address, AddressResponse.class);
            addressResponseList.add(addressResponse);
        }
        return addressResponseList;
    }
}
