package com.skoti.optional;

import com.skoti.map_flatmap.Customer;
import com.skoti.map_flatmap.CustomerDatabase;

import java.util.List;

public class OptionalDemoWithStreams {

  public static void main(String[] args) {

    Customer customerByEmailID = getCustomerByEmailID("john111@gmail.com");
    System.out.println(customerByEmailID);
  }

  public static Customer getCustomerByEmailID(String email) {
    List<Customer> customerDetails = CustomerDatabase.getCustomerDetails();
    return customerDetails.stream()
        .filter(customer -> customer.getEmail().equalsIgnoreCase(email))
        .findAny()
        .orElseThrow(() -> new IllegalArgumentException("no customer present with this email id"));
  }
}
