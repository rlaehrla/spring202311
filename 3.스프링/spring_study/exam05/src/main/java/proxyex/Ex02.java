package proxyex;

public class Ex02 {
    public static void main(String[] args) {
        proxyCalculator cal1 = new proxyCalculator(new ImplCalculator());
        long result1 = cal1.factorial(10L);
        System.out.printf("cal1 : %d%n", result1);

        proxyCalculator cal2 = new proxyCalculator(new RecCalculator());
        long result2 = cal2.factorial(10L);
        System.out.printf("cal2 : %d%n", result2);
    }
}
