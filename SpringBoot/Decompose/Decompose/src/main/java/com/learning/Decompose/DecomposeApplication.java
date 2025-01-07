package com.learning.Decompose;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.learning.Decompose.*", "com.example.common.*"})
public class DecomposeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DecomposeApplication.class, args);
	}

}
