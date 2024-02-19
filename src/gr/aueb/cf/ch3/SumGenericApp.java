package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει 1 + 2+ 3+...+ n
 * οπουν το δινει ο χρηστης
 */
public class SumGenericApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int endValue = 0;
        int i = 1;
        int result = 0;

        System.out.println("Please insert a number (int): ");
        endValue = scanner.nextInt();

        while (i <= endValue){
            result += i;
            i++;
        }
        System.out.printf("Sum 1+2+...+%d = %d", endValue, result);

    }

}
