package com.ntuc.logs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackDemo {
    private static final Logger logger = LoggerFactory.getLogger(LogbackDemo.class);

    public static void main(String[] args) {
        logger.info("Info Message");
        logger.debug("debug Message");
        logger.warn("Warning Message");
        logger.error("Error Message");

    }

}
