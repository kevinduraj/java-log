package kduraj;

import org.apache.log4j.Logger;

/**----------------------------------------------------------------------------------
 *  java -cp logger.jar kduraj.MyLog1
 -----------------------------------------------------------------------------------*/
public class MyLog1 {

    final static Logger logger = Logger.getLogger(MyLog1.class);
    /*------------------------------------------------------------------------------*/

    public static void main(String[] args) {

        MyLog1 obj = new MyLog1();
        obj.test1();
        obj.test2("logging...");

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

        logger.warn("This is warn : " + parameter);
        logger.error("This is error : " + parameter);
        logger.fatal("This is fatal : " + parameter);

    }


    /*------------------------------------------------------------------------------*/

}