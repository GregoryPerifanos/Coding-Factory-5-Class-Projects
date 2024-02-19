package gr.aueb.cf.ch3;

public class Mul10App {
    public static void main(String[] args) {
        int i= 1;
        int result = 1;

        while (i <= 10) {
            result *= i;
            i++;
        }
        System.out.printf("Result: %,d", result);
    }
}
