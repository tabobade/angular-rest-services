package com.rest.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class RestStarter {

	public static void main(String[] args) {
		SpringApplication.run(RestStarter.class, args);
	}

}
