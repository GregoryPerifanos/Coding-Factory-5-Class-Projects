package gr.aueb.cf.ch3;

import java.util.Scanner;

public class Division2App {
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

            if (numerator == 0) {
                System.out.println("Error: Denominator can't be zero");
                break;
            }

            if (denominator == 0) {
                System.out.println("Error Numerator can't be zero");
                break;
            }

            result= numerator / denominator;

            System.out.println("Result: " + result);
        }
    }

}
