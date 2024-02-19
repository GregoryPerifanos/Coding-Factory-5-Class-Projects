package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMissMatchException {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        final int MAGIC_SECRET = 12;

        while (true){

            try{
                System.out.println("please insert the magic num");
                inputNum = in.nextInt();
                if (inputNum == MAGIC_SECRET) {
                    System.out.println("Success!!!");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println(" Error: Invalid input token");
                in.nextLine(); // recover
            }
        }
    }
}
