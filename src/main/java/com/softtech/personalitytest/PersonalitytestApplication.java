package com.softtech.personalitytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:3000")
@SpringBootApplication
public class PersonalitytestApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalitytestApplication.class, args);
		System.err.println("PERSONALITY TEST!");
	}
	
}
