package com.babubuy.registration.controllers;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
public class RegistrationController {

	public RegistrationController() {
		System.out.println("Registration Controller is created....");
	}
	
	@GetMapping("/welcome")
	public String welcomeMsg() {
	
		return "Welcome To BabuBuy Registraion Service";
	}
}
