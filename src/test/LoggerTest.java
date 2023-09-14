package test;

import main.java.MyLogger;

public class LoggerTest {
    public static int sum(int a, int b) {
        MyLogger.getLogger().info("덧셈 수행 : " + a + " + " + b); // info 까지만 나옴
        return a + b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            MyLogger.getLogger().warning("나눗셈 에러 발생!"); // warring 까지의 정보 나옴
            // throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(sum(a, b));
        System.out.println(divide(a, 0));
    }
}
