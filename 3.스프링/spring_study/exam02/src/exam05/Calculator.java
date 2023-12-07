package exam05;

public interface Calculator {

    int num = 10;  // public static final

    // public abstract
    // 접근제한자도 public만 가능!!
    int add(int num1, int num2);

    default int minus(int num1, int num2){
        return num1 - num2;
    }
}
