package com.airhub.stepbystep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.airhub.stepbystep")
public class StepbystepApplication {

	public static void main(String[] args) {
		SpringApplication.run(StepbystepApplication.class, args);
	}
}