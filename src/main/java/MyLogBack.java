package main.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyLogBack {

    static Logger logger = LoggerFactory.getLogger("logger");

    public static int sum(int a, int b) {

        logger.trace("테스트용 {} {}", a, b);
        logger.info("덧 셈 실행 : {} + {}", a, b);
        return a + b;

    }

    public static int devide(int a, int b) {
        if (b == 0) {
            logger.warn("나누기 실패 .. 0으로 못 나눔");
            throw new ArithmeticException("0으로 못 나눔");
        }
        return a / b;
    }

    public static void main(String[] args) {
        int a = 6;
        int b = 2;
        System.out.println(sum(a, b));
        // System.out.println(devide(a, 0));
    }
}
