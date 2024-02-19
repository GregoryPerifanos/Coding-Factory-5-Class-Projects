package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * οσο ο χρηστης δινει θετικους ακεραιους
 * τους μετραμε μεχρι ο χρηστης να δωσει αρνιτικο
 */
public class PositiveCoutApp {

    public static void main(String[] args) {
        int inputNum = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert a num (negative for Quit");
        inputNum = scanner.nextInt();

        while (inputNum >= 0){
            count++;
            System.out.println("Please insert a num (negative for Quit");
            inputNum = scanner.nextInt();
        }
        System.out.println("Count" + count);

    }
}
