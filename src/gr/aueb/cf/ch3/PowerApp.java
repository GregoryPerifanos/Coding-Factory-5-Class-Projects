package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογιζει a^n πχ
 * το 2^10=1024 3^3= 17
 */
public class PowerApp {
    public static void main(String[] args) {
        int base = 0;
        int power = 0;
        int result = 1;
        int i = 1;

        Scanner scanner = new Scanner(System.in);


        System.out.println("insert bace and power:");
        base = scanner.nextInt();
        power = scanner.nextInt();

        while (i <= power){
            result *= base;
            i++;
        }

        System.out.println("Result: " + result);


    }
}
