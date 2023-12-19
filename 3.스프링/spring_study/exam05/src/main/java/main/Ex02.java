package main;

import config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import aopex.RecCalculator;

public class Ex02 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
        RecCalculator cal = ctx.getBean(RecCalculator.class); // Proxy 객체
        long result = cal.factorial(10L);
        System.out.println(result);

        ctx.close();
    }
}
