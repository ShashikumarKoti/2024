package com.skoti.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.*")
public class SpringBootResponseEntityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootResponseEntityApplication.class, args);
	}

}
