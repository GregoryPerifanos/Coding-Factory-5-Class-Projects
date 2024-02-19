package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * take to intergers and diviges them
 */
public class DivisionApp {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result;


        while (true) {
            System.out.println("Please insert Numerator");
            numerator = scanner.nextInt();

            System.out.println("Please insert Denominator");
            denominator = scanner.nextInt();

            if (numerator != 0) {
                if (denominator != 0) {
                    result = numerator / denominator;
                } else {
                    System.out.println("Denominator can not be zero");
                    break;
                }
            } else {
                System.out.println("Numerator can not be zero");
                break;
            }

            System.out.println("Result: " + result);
        }
    }
}
