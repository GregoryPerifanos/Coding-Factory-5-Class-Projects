package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * simple calculator
 */
public class CalculatorApp {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int result = 0;
        int choice = 0;

        while (true) {
            printMenu();
            choice = getUserChoice();

            if (choice < 1 || choice > 6) {
                System.out.println("Λάθος Επιλογή");
                continue;
            }

            if (choice == 6) {
                System.out.println("Έξοδος");
                break;
            }

            System.out.println("Παρακαλώ εισάγετε δύο ακεραίους");
            num1 = getOneNumber();
            num2 = getOneNumber();
            result = getResult(choice, num1, num2);
            System.out.println("Το Αποτέλεσμά σας είναι: " + result);

        }
    }

    public static void printMenu() {
        System.out.println("Choose one of the following");
        System.out.println("1. Πρόσθεση");
        System.out.println("2. Αφέρεση");
        System.out.println("3. Πολλαπασιασμός");
        System.out.println("4. Διαίρεση");
        System.out.println("5. Υπόλοιπο Διαίρεσης");
        System.out.println("6. Έξοδος");
    }
    public static int getUserChoice() {
        return in.nextInt();
    }

    public static int getOneNumber() {
        return in.nextInt();
    }

    public static int add(int a, int b){
        return a + b;
    }
    public static int sub(int a, int b){
        return a - b;
    }
    public static int mul(int a, int b){
        return a * b;
    }

    public static int div(int a, int b) {
        if (b == 0) {
            System.out.println("Λάθος Αριθμός: 0");
            return 0;
        }
        return a / b;
    }

    public static int mod(int a, int b) {
        if (b == 0) {
            System.out.println("Λάθος Αριθμός: 0");
            return 0;
        }
        return a % b;
    }
    public static int getResult(int choice, int num1, int num2) {
        int result = 0;

        switch (choice) {
            case 1:
                result = add(num1,num2);
                break;
            case 2:
                result = sub(num1,num2);
                break;
            case 3:
                result = mul(num1,num2);
                break;
            case 4:
                result = div(num1,num2);
                break;
            case 5:
                result = mod(num1,num2);
                break;
            case 6:
                System.out.println("Επιλέξατε Έξοδο");
                break;
            default:
                System.out.println("Λάθος επιλογή");
                break;
        }

        return  result;
    }
}
