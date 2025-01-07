package com.example.SB_Async;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableAsync
public class SbAsyncApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbAsyncApplication.class, args);
	}

	@Bean(name = "asyncExecutor1")
	public AsyncTaskExecutor asyncExecutor() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(5); // Set your desired core pool size
		executor.setMaxPoolSize(10); // Set your desired maximum pool size
		executor.setQueueCapacity(100); // Set your desired queue capacity
		executor.setThreadNamePrefix("AsyncThread-");
		executor.initialize();
		return executor;
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
