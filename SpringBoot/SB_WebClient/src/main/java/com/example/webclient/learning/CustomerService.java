package com.example.webclient.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerDao customerDao;

    public List<Customer> loadAllCustomers() {
        long startTime = System.currentTimeMillis();
        List<Customer> customerList = customerDao.getCustomers();
        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time:" + (endTime-startTime));
        return customerList;
    }

    public Flux<Customer> loadAllCustomersReactively() {
        long startTime = System.currentTimeMillis();
        Flux<Customer> customerList = customerDao.getCustomersReactively();
        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time with Reactive:" + (endTime-startTime));
        return customerList;
    }
}
