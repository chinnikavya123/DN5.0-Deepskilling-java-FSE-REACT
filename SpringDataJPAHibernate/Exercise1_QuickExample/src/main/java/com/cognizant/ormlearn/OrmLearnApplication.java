package com.cognizant.ormlearn;

import com.cognizant.ormlearn.service.CountryService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

// Marks this as a Spring Boot application
@SpringBootApplication
public class OrmLearnApplication {

    public static void main(String[] args) {

        // Start the Spring Boot application
        ApplicationContext context =
                SpringApplication.run(
                        OrmLearnApplication.class,
                        args);

        // Get the CountryService bean
        CountryService service =
                context.getBean(CountryService.class);

        // Call the service method
        service.addCountry();
    }
}

/*
 * Output:
 * Country added successfully.
 *
 * Learned:
 * - Started the Spring Boot application.
 * - Retrieved the service bean from Spring.
 * - Called the service method.
 * - Spring managed the objects automatically.
 */