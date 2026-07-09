package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.BookService;
import com.library.repository.BookRepository;

public class LibraryManagementApplication {

    public static void main(String[] args) {

        // Load the Spring configuration file
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the BookService bean
        BookService service =
                context.getBean("bookService", BookService.class);

        // Get the BookRepository bean
        BookRepository repository =
                context.getBean("bookRepository", BookRepository.class);

        // Call service method
        service.displayService();

        // Call repository method
        repository.displayRepository();
    }
}

/*
 * Output:
 * Book Service is Working
 * Book Repository is Working
 *
 * Learned:
 * - Loaded the Spring application context.
 * - Retrieved beans using getBean().
 * - Spring created and managed the beans.
 * - Called methods using Spring beans.
 */