package com.ntuc.logs;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ConsoleLogs {
    // getting the handle of the logger to the current class
    static Logger logger = Logger.getLogger(ConsoleLogs.class.getName());

    public static void main(String[] args) {
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setFormatter(new SimpleFormatter());
        consoleHandler.setLevel(Level.CONFIG);
        logger.setUseParentHandlers(false);
        logger.addHandler(consoleHandler);
        logger.setLevel(Level.CONFIG);

        logger.info("This is a info message");
        logger.config("User added");
        logger.warning("Warning Message");
        logger.severe("Severe Message");
    }
}
