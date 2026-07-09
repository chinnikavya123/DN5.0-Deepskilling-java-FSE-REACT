package com.cognizant.springrest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.springrest.model.Country;

public class SpringRestApplication {

    public static void main(String[] args) {

        // Load the Spring configuration file
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the Country bean from Spring
        Country country = context.getBean("country", Country.class);

        // Display the bean details
        System.out.println(country);

    }
}

/*
 * Output:
 * Country [code=IN, name=India]
 *
 * Learned:
 * - Loaded the Spring application context.
 * - Retrieved the Country bean using getBean().
 * - Spring created and managed the Country object.
 * - Displayed the bean using toString().
 */