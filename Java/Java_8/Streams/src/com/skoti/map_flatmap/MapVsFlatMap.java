package com.skoti.map_flatmap;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

  public static void main(String[] args) {
    List<Customer> customerDetails = CustomerDatabase.getCustomerDetails();
    // map usage
    List<String> customerEmailsList =
        customerDetails.stream()
            .map(customer -> customer.getEmail())
            .sorted()
            .collect(Collectors.toList());
    System.out.println(customerEmailsList);

    List<List<String>> customerPhoneNumbersList =
        customerDetails.stream()
            .map(customer -> customer.getPhoneNumbers())
            .collect(Collectors.toList());
    System.out.println(customerPhoneNumbersList);

    // flatMap usage
    List<String> customerPhoneNumbersFlatteredList =
        customerDetails.stream()
            .flatMap(customer -> customer.getPhoneNumbers().stream())
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList());
    System.out.println(customerPhoneNumbersFlatteredList);
  }
}
