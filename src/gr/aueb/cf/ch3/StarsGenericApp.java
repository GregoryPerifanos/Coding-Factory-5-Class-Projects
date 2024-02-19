package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δίνει ο χρηστης stdin το πληθος
 * των αστεριων
 */
public class StarsGenericApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stars = 0;
        int i = 1;

        System.out.println("Please insert number of stars:");
        stars = scanner.nextInt();

        while (i <= stars) {
            System.out.print("*");
            i++;
        }

    }
}
