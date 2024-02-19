package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογιζει το n!
 */
public class FactotialApp {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n = 0;
        int facto = 1;
        int i = 1;

        System.out.println("please insert n");
        n = scanner.nextInt();

        while (i <= n) {
            facto *=i;
            i++;
        }

    }
}
