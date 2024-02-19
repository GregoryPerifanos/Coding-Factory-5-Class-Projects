package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * λαμβανει ως εισοδο true/false απο το stdin,
 */
public class TankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isEmptyTank1 = false;
        boolean isEmptyTank2 = false;
        boolean isOrange = false;
        boolean isRed = false;

        System.out.println("Pease insert tank1 status (thrue / false)");
        isEmptyTank1 = scanner.nextBoolean();

        System.out.println("Pease insert tank2 status (thrue / false)");
        isEmptyTank2 = scanner.nextBoolean();

        isOrange = isEmptyTank1 ^ isEmptyTank2;
        isRed = isEmptyTank1 && isEmptyTank2;

        System.out.println("Orange: " + isOrange + ", Red:" +isRed);
    }
}
