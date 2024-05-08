package com.example.SB_Async;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
public class SbAsyncApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbAsyncApplication.class, args);
	}

}
