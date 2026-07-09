package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.BookService;

public class LibraryManagementApplication {

    public static void main(String[] args) {

        // Load the Spring configuration file
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the BookService bean from Spring
        BookService service =
                context.getBean("bookService", BookService.class);

        // Call the service method
        service.displayService();
    }
}

/*
 * Output:
 * Book Service is Working
 * Book Repository is Working
 *
 * Learned:
 * - Loaded the Spring application context.
 * - Retrieved the BookService bean using getBean().
 * - Spring injected the BookRepository into BookService.
 * - Used Dependency Injection instead of creating objects with new.
 */