package kduraj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    public static void main(String[] args) {

        System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");

        Logger logger = LoggerFactory.getLogger(App.class);

        logger.trace("logger.trace");
        logger.debug("logger.debug");
        logger.info("logger.info");
        logger.warn("logger.warn");
        logger.error("logger.error");
    }
}
