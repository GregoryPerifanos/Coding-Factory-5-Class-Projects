package gr.aueb.cf.ch3;

import java.util.Scanner;

public class DigitCountApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int num = 0;
        int count = 0;

        System.out.println("Please insert num");
        inputNum = scanner.nextInt();



        num = inputNum;
        do{
            count++;
            num = num / 10;
        } while (num != 0);

        System.out.println("Digit count:" + count);

    }
}
