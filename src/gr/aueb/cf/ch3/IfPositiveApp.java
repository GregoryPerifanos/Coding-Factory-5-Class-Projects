package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ελεγχει αν ενας αριθμας εινμαι θετικοσ
 */
public class IfPositiveApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("Please insert an int");
        num = scanner.nextInt();

        if (num >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
}
