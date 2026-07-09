package com.cognizant.springrest.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springrest.model.Country;

// Marks this class as a REST controller
@RestController
public class CountryController {

    // Handles GET request for /country
    @GetMapping("/country")
    public Country getCountry() {

        // Load the Spring configuration
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the Country bean
        Country country = context.getBean("country", Country.class);

        // Close the context
        context.close();

        // Return the Country object as JSON
        return country;
    }

}

/*
 * Output:
 * {
 *   "code": "IN",
 *   "name": "India"
 * }
 *
 * Learned:
 * - Used @RestController to create a REST API.
 * - Used @GetMapping to handle GET requests.
 * - Retrieved a bean from the Spring container.
 * - Returned a Java object as JSON.
 */