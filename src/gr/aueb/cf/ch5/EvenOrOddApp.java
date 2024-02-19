package gr.aueb.cf.ch5;

import java.util.Scanner;

public class EvenOrOddApp {
    public static void main(String[] args) {
        System.out.println("is even " + isEven(5));

    }

    /**
     * Evaluates a number if it is even.
     * @param a     the input number.
     * @return      true, if is even, false otherwise.
     */
    public static boolean isEven(int a) {
        return (a % 2) == 0;
    }
    /**
     * Evaluates a number if it is odd.
     * @param a     the input number.
     * @return      true, if is odd, false otherwise.
     */
    public static boolean isOdd(int a) {
        return (a % 2) != 0;
    }
}
