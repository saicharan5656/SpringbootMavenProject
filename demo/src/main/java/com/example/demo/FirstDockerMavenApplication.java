package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstDockerMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstDockerMavenApplication.class, args);
		
		System.out.print("hi this is from springboot application start");
	}

}
