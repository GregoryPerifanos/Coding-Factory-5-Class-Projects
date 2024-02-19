package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * υπολογιζει 1*2*...*ν ν το δινει ο χρηστης
 */
public class MulGenApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int endValue = 0;
        int i = 1;
        int result = 1;
        System.out.println("pleae insert number (int)");
        endValue = scanner.nextInt();
        while (i <= endValue) {
            result *= i;
            i++;
        }
        System.out.printf("Result: %,d",result);
    }
}
