package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * two grades and a sum and we must find the average
 */
public class ifAverageApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int average = 0;
        int grade1 = 0;
        int grade2 = 0;
        int total = 0;

        System.out.println("please insert grade");
        grade1 = scanner.nextInt();
        grade2 = scanner.nextInt();
        total = scanner.nextInt();

        if (total !=0) {
            average = (grade1 + grade2) / total;
            if (average >= 8) {
                System.out.println("Excellent");
            } else if (average >= 6) {
                System.out.println("Very Good");
            } else if (average >= 4) {
                System.out.println("Pass");
            }else {
                System.out.println("Fail");
            }
        } else {
            System.out.println("Error: divideby zero!");
        }
    }
}
