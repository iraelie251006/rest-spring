package com.iraelie.rest_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RestSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestSpringApplication.class, args);
	}
	@GetMapping
	public String helloWorld() {
		return "Hello spring boot";
	}
}
