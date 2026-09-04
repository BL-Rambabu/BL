package com.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

public class HelloWorld {

    private static final Logger logger = LogManager.getLogger(HelloWorld.class);

    public static void main(String[] args) {
        // Simple Hello World
        System.out.println("Hello World!");

        // Predefined Log4j2 information such as timestamp, thread, level,
        // logger name and message are configured in log4j2.xml.
        logger.info("Application started");
        logger.debug("This is a debug message");
        logger.warn("This is a warning message");
        logger.error("This is an error message");

        // Custom keys using ThreadContext
        ThreadContext.put("userId", "USR101");
        ThreadContext.put("requestId", "REQ-5001");
        ThreadContext.put("application", "JavaLog4j2Demo");

        logger.info("Logging with custom keys");

        ThreadContext.clearAll();

        logger.info("Application finished");
    }
}
