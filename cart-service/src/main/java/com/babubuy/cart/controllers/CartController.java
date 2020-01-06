package com.babubuy.cart.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {
	
	@GetMapping("/welcome")
	public String welcomeMsg() {
		
		return "Welcome To The Cart Service";
	}

}
