package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    // Create a logger object
    private static final Logger logger =
            LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {

        // Log an error message
        logger.error("This is an error message");

        // Log a warning message
        logger.warn("This is a warning message");

    }

}

/*
 * Output:
 * ERROR - This is an error message
 * WARN  - This is a warning message
 *
 * Learned:
 * - Used SLF4J for logging.
 * - Used logger.error() to log errors.
 * - Used logger.warn() to log warnings.
 * - Logback displays the log messages.
 */