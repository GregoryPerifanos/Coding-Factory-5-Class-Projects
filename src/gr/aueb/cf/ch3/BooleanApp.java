package gr.aueb.cf.ch3;

import java.util.Scanner;

public class BooleanApp {
    public static void main(String[] args) {
        boolean isWoman = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Are you a woman  (treu or false)");
        isWoman = scanner.nextBoolean();

        System.out.printf("Is Woman; %b", isWoman);
        System.out.println("Is Woman" + isWoman);
    }
}
