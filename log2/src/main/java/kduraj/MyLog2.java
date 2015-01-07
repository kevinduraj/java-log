package kduraj;

import org.apache.log4j.Logger;

public class MyLog2 {

    final static Logger logger = Logger.getLogger(MyLog2.class);

    /*------------------------------------------------------------------------------*/
    public static void main(String[] args) {

        MyLog2 obj = new MyLog2();

        try {
            obj.divide();
        } catch (ArithmeticException ex) {
            logger.error("Sorry, something wrong!", ex);
        }

    }

    /*------------------------------------------------------------------------------*/
    private void divide() {

        int i = 10 / 0;

    }
    /*------------------------------------------------------------------------------*/
}