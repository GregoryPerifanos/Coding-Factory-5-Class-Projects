package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * read temp and a boolean if it rains
 * form stdin
 */
public class SnowApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = 0;
        boolean isRaining = false;
        boolean isSnowing = false;

        System.out.println("Please insert temp");
        temp = scanner.nextInt();
        System.out.println("Please insert if raining (true / false)");
        isRaining =scanner.nextBoolean();

        isSnowing = isRaining && temp <0; //sort-circuit

        System.out.println("Is snowing" + isSnowing);
    }
}
