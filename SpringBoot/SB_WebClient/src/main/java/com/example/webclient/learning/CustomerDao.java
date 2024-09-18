package com.example.webclient.learning;

import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.List;
import java.util.stream.IntStream;

@Component
public class CustomerDao {

    public List<Customer> getCustomers() {
        return IntStream.rangeClosed(1,50)
                .peek(CustomerDao::sleepExecution)
                .peek( i -> System.out.println("Processing count: " + i))
                .mapToObj( i -> new Customer(i, "customer-"+i ))
                .toList();
    }

    public Flux<Customer> getCustomersWithoutDelay() {
        return Flux.range(1,50)
                .doOnNext( i -> System.out.println("Processing count using Reactive: " + i))
                .map( i -> new Customer(i, "customer-"+i ));
    }

    public Flux<Customer> getCustomersReactively() {
        return Flux.range(1,10)
                .delayElements(Duration.ofSeconds(1))
                .doOnNext( i -> System.out.println("Processing count using Reactive: " + i))
                .map( i -> new Customer(i, "customer-"+i ));
    }

    public Flux<Customer> getCustomersStream()  {
        return Flux.range(1,10)
                .delayElements(Duration.ofSeconds(1))
                .doOnNext(i -> System.out.println("processing count in stream flow : " + i))
                .map(i -> new Customer(i, "customer" + i));
    }

    private static void sleepExecution(int i)  {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
