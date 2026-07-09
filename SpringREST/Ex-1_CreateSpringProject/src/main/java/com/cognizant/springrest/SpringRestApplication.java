package com.cognizant.springrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Marks this as a Spring Boot application
@SpringBootApplication
public class SpringRestApplication {

    public static void main(String[] args) {

        // Start the Spring Boot application
        SpringApplication.run(SpringRestApplication.class, args);

        // Print a message after startup
        System.out.println("Spring Boot Project Started");

    }

}

/*
 * Output:
 * Spring Boot Project Started
 *
 * Learned:
 * - Used @SpringBootApplication to configure the project.
 * - Started the application using SpringApplication.run().
 * - Spring Boot automatically initialized the application.
 * - Verified the application started successfully.
 */