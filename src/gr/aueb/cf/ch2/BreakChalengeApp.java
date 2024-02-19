package gr.aueb.cf.ch2;

import java.util.Scanner;

public class BreakChalengeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("insert nummber: ");
        int num = scanner.nextInt();

        int firstDigit = num /10;
        int secondDigit = num % 10;

        int sum = firstDigit + secondDigit;

        System.out.printf("the sum is: %d",sum);

    }
}
