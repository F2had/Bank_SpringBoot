package com.bank_system.Bank.System.Spring.Boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class BankSystemSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankSystemSpringBootApplication.class, args);
	}
	
	
	@RestController
	public class HomeController {

	    @RequestMapping("/")
	    public String home(){
	        return "Hello World!";
	    }
	}
}
