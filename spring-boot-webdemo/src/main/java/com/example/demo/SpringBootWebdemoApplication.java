package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // =  @Configuration + @EnableAutoConfiguration + @ComponentScan.
public class SpringBootWebdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebdemoApplication.class, args);
	}

}
