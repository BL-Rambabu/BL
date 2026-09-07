package DAY1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

public class HelloWorld {

    private static final Logger logger = LogManager.getLogger(HelloWorld.class);

    public static void main(String[] args) {
        System.out.println("Hello World!");

        logger.info("Application started");
        logger.debug("This is a debug message");
        logger.warn("This is a warning message");
        logger.error("This is an error message");

        ThreadContext.put("userId", "USR101");
        ThreadContext.put("requestId", "REQ-5001");
        ThreadContext.put("application", "JavaLog4j2Demo");

        logger.info("Logging with custom keys");

        ThreadContext.clearAll();

        logger.info("Application finished");
    }
}
