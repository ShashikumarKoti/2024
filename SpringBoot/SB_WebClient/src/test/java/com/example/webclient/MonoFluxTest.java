package com.example.webclient;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class MonoFluxTest {

    /*
      Mono.just() - creates a Mono object
      Flux.just() - creates a Flux object
      Mono/Flux acts a publisher
     */
    @Test
    public void testMono() {

        Mono<String> monoString = Mono.just("monoLearning").log();
        monoString.subscribe(System.out::println);
    }

    @Test
    public void testMonoWithException() {
        Mono<?> monoString = Mono.just("monoLearningWithException").
                then(Mono.error(new RuntimeException("Exception occurred in Mono"))).log();
        monoString.subscribe(System.out::println, exception -> System.out.println(exception.getMessage()));
    }

    @Test
    public void testFlux() {
        Flux<String> fluxString = Flux.just("Virat", "Jadeja", "Bumrah", "Rohit").concatWithValues("Dhoni").log();
        fluxString.subscribe(System.out::println);
    }

    @Test
    public void testFluxWithException() {
        Flux<String> fluxString = Flux.just("Virat", "Jadeja")
                .concatWith(Flux.error(new RuntimeException("Exception occurred in Flux")))
                .concatWithValues("Bumrah")
                .log();
        fluxString.subscribe(System.out::println, exception -> System.out.println(exception.getMessage()));
    }
}
