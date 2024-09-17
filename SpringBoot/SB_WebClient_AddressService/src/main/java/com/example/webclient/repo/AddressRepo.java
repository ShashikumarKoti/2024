package com.example.webclient.repo;

import com.example.webclient.model.Address;

import java.util.Arrays;
import java.util.List;

public class AddressRepo {

    public static Address findAddressByEmpId(int empId) {
        return switch (empId) {
            case 1 -> new Address(11, "Bangalore", "Karnataka");
            case 2 -> new Address(22, "Chennai", "TamilNadu");
            case 3 -> new Address(33, "Melbourne", "Australia");
            default -> new Address();
        };
    }

    public static List<Address> findAllAddresses() {
        return Arrays.asList(
                new Address(1, "Bangalore", "Karnataka"),
                new Address(2, "Chennai", "TamilNadu"),
                new Address(3, "Melbourne", "Australia")
        );
    }
}
