package com.babubuy.registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.babubuy.registration.*")
public class RegistrationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistrationServiceApplication.class, args);
	}

}
