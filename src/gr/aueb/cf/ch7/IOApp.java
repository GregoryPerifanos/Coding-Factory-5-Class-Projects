package gr.aueb.cf.ch7;

import java.util.Scanner;

/**
 * Demonstrates the I/O with Strings
 */
public class IOApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s; //null
        int num;

        System.out.println("Please insert a string that ends with whitespace (space/tab/return) ");
        s = in.next();
        num = Integer.parseInt(s);
        System.out.println(s);

//        System.out.println("please insert a string that ends with return");
//        s = in.nextLine();
//        System.out.print(s);
    }
}
