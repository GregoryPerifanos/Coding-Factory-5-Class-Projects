package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * switch/case demo
 */
public class SwitchApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {


        System.out.println("Please insert one of the following");
        System.out.println("1. One-player game");
        System.out.println("2. Two-player game");
        System.out.println("3. Team Death match");
        System.out.println("4. Exit");
        System.out.println("Please insert choice");

        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("One-player game initializing!");
                break;
            case 2:
                System.out.println("Two-player game initializing!");
                break;
            case 3:
                System.out.println("Team Death match initializing!");
                break;
            case 4:
                System.out.println("Exit initialization!");
                break;
            default:
                System.out.println("Error in choice meat bag!!");
                break;

        }
    } while (choice != 4);
}
}
