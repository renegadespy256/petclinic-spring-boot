package com.soham.petclinicspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.soham.petclinicspringboot"})
@SpringBootApplication
public class PetclinicSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetclinicSpringBootApplication.class, args);
	}

}
