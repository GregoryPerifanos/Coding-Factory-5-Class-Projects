package gr.aueb.cf.ch3;

import java.util.Scanner;

public class IfAbsApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int abs = 0;

        System.out.println("please give int");
        abs = (num >= 0) ? num : -num;

        System.out.println("Abs of" + num+ "is" +abs);
    }
}
