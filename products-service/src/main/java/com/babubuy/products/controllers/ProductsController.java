package com.babubuy.products.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {
	
	public ProductsController() {
		
		System.out.println("Products Controller Created");
	}

	@GetMapping("/welcome")
	public String welcomeMsg() {
	  return "Welcome To Product Service";	
	}
}
