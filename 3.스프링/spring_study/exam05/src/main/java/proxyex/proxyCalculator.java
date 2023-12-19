package proxyex;

import java.awt.*;

public class proxyCalculator implements Calculator {

    private Calculator calculator;

    public proxyCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public long factorial(long num) {

        long stime = System.nanoTime(); // 공통 기능

        try {

            long result = calculator.factorial(num); // 핵심 기능을 대신 수행

            return result;
        } finally {
            long etime = System.nanoTime(); // 공통 기능
            System.out.printf("걸린시간 : %d%n", etime -stime);
        }
    }
}
