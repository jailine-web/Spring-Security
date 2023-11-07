package com.devsuperior.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Encode = "+passwordEncoder.encode("1234"));
		
		boolean result = passwordEncoder.matches("1234", "$2a$10$TNkmO8Sv5KxT9ZQ4AYH8heWH7JUxFX3ZNkXT..T0Z5Bu9v6SzS4am");
		
		System.out.println("Resultado: "+ result);
	}

}
