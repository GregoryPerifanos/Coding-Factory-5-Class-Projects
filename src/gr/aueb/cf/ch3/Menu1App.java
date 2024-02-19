package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * εμφανιζεται εξακολουθιτικα
 * ενα μενου στον χρηστη με επιλογες
 * μεχρι να δωσει 3. quit
 *
 */
public class Menu1App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.println("choose one of the following:");
            System.out.println("1. one player game");
            System.out.println("2. two player game");
            System.out.println("3. exit");

            choice = scanner.nextInt();

            if (choice <= 0 || choice >= 4) {
                System.out.println("wrong choice");
                continue;
            }

            if (choice == 3) {
                System.out.println("exiting");
            }

            if (choice == 1) {
                System.out.println("one player game starting...");
            } else { //if (choise == 2)
                System.out.println("two player game starting...");
            }
        }
    }
}
