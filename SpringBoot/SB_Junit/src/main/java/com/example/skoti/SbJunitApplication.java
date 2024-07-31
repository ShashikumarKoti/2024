package com.example.skoti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SbJunitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbJunitApplication.class, args);
	}

}
