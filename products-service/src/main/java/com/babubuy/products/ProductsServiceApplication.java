package com.babubuy.products;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.babubuy.products.*")
public class ProductsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductsServiceApplication.class, args);
	}

}
