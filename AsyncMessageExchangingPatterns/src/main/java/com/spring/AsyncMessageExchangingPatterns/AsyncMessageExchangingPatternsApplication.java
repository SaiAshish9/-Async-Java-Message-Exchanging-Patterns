package com.spring.AsyncMessageExchangingPatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class AsyncMessageExchangingPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AsyncMessageExchangingPatternsApplication.class, args);
	}

}
