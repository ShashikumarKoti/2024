package com.skoti.optional;

import com.skoti.map_flatmap.Customer;

import java.util.Arrays;
import java.util.Optional;

public class OptionalDemo {
  public static void main(String[] args) {
    Customer customer = new Customer(201, "John", null, Arrays.asList("545213", "787812"));
    Customer customer2 =
        new Customer(201, "John", "abc@gmail.com", Arrays.asList("545213", "787812"));
    /*
       3 ways to create optional object
         1. using 'empty'
         2. using 'of'
         3. using 'ofNullable'
    */

    Optional<Object> emptyOptional = Optional.empty();
    System.out.println(emptyOptional);

    // should be used when we are sure that the object passed as parameter is not null else will get
    // NPE
    Optional<String> nameOptional = Optional.of(customer.getName());
    if (nameOptional.isPresent()) System.out.println(nameOptional.get());

    // this throws exception
    //    Optional<String> emailOptional = Optional.of(customer.getEmail());
    //    if (emailOptional.isPresent()) System.out.println(emailOptional.get());

    // should be used when we are NOT sure that the object passed as parameter is null or not
    Optional<String> emailOptional2 = Optional.ofNullable(customer.getEmail());
    if (emailOptional2.isPresent()) System.out.println(emailOptional2.get());

    Optional<String> emailOptional3 = Optional.ofNullable(customer.getEmail());
    System.out.println(emailOptional3.orElse("defaultEmail@gmail.com"));

    Optional<String> emailOptional4 = Optional.ofNullable(customer2.getEmail());
    System.out.println(emailOptional4.orElse("defaultEmail@gmail.com"));

    Optional<String> emailThrowException2 = Optional.ofNullable(customer2.getEmail());
    System.out.println(
        emailThrowException2.orElseThrow(() -> new IllegalArgumentException("email not present")));

    // this throws exception
    //    Optional<String> emailThrowException = Optional.ofNullable(customer.getEmail());
    //    System.out.println(
    //        emailThrowException.orElseThrow(() -> new IllegalArgumentException("email not
    // present")));

    System.out.println(emailOptional4.map(String::toUpperCase).orElseGet(() -> "default email"));
    System.out.println(emailOptional3.map(String::toUpperCase).orElseGet(() -> "default email"));
  }
}
