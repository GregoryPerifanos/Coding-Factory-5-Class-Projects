package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMissMatchException2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        final int MAGIC_SECRET = 12;

        while (true){
            System.out.println("please insert magic number");

            if (!in.hasNextInt()) {
                System.out.println("Invalid token");
                in.nextLine();
                continue;
            }



            inputNum = in.nextInt();
            System.out.println("You inserted: " + inputNum);
            if (inputNum == MAGIC_SECRET) {
                System.out.println("Success!!!");
                break;
            }
        }
    }
}
