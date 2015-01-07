package kduraj;

import org.apache.log4j.Logger;

public class MyLogger {

    final static Logger logger = Logger.getLogger(MyLogger.class);
    /*------------------------------------------------------------------------------*/

    public static void main(String[] args) {

        MyLogger obj = new MyLogger();
        obj.test1();
        obj.test2("test");

    }

    /*------------------------------------------------------------------------------*/
    public static void test1() {
        System.out.println("true = " + true);
    }
    /*------------------------------------------------------------------------------*/


    private void test2(String parameter) {

        if (logger.isDebugEnabled()) {
            logger.debug("This is debug : " + parameter);
        }

        if (logger.isInfoEnabled()) {
            logger.info("This is info : " + parameter);
        }

        logger.trace("logger.trace: "  + parameter);
        logger.debug("logger.debug: " + parameter);
        logger.info("logger.info: " + parameter);

        logger.warn("logger.warn: " + parameter);
        logger.error("logger.error: " + parameter);
        logger.fatal("logger.fatal : " + parameter);

    }


    /*------------------------------------------------------------------------------*/

}