package com.skoti.map_flatmap;

import java.util.Arrays;
import java.util.List;

public class CustomerDatabase {

  public static List<Customer> getCustomerDetails() {
    return Arrays.asList(
        new Customer(201, "John", "john@gmail.com", Arrays.asList("545213", "787812")),
        new Customer(101, "Eve", "eve@gmail.com", Arrays.asList("424244", "575454")),
        new Customer(401, "Adam", "adam@gmail.com", Arrays.asList("123456", "987644")),
        new Customer(301, "Newton", "newton@gmail.com", Arrays.asList("333333", "222222")));
  }
}
