package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρηστης δινει αρχικη τελικη και βημα
 * αυξησησ και υπολογιζει τον αριθμο των επαναληψεων
 */
public class GanericWhileAPP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = 0;
        int endValue = 0;
        int step = 0;
        int iterations = 0;
        int j = 1;

        while (j <= 3){
            System.out.println("Please insert biginValue, endValue and step");
            start = scanner.nextInt();
            endValue = scanner.nextInt();
            step = scanner.nextInt();




            while (start <= endValue) {
                iterations++;
                start += step;
            }

            System.out.println("Iterations:" + iterations);
            j++;
        }

        System.out.println("thanks for using the app");

    }
}
