package com.ntuc.logs;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;

@SuppressWarnings("unused")
public class FileLogs {
    // getting the handle of the logger to the current class
    static Logger logger = Logger.getLogger(FileLogs.class.getName());

    public static void main(String[] args) {
        try {
            FileHandler fileHandler = new FileHandler("mylogs.log", true);
            // fileHandler.setFormatter(new SimpleFormatter());
            fileHandler.setFormatter(new XMLFormatter());

            logger.setUseParentHandlers(false);
            logger.addHandler(fileHandler);
            logger.setLevel(Level.INFO);

            logger.info("This is a Info Message");

        } catch (SecurityException | IOException e) {
        }

    }
}
