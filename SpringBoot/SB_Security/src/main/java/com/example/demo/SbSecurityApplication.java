package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class, scanBasePackages = {"com.example.demo.*"})

public class SbSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbSecurityApplication.class, args);
	}

}
