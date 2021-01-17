package com.bank_system.Bank.System.Spring.Boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.bank_system.Bank.System.Spring.*")
public class BankSystemSpringBootApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(BankSystemSpringBootApplication.class, args);
	}
}
