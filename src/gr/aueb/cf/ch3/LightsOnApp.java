package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αποφασιζει αν θα αναψει τα φωτα ή οχι
 * με βαση αν βρεχει , αν ειναι σκωτεινα
 * και αν η ταχυτητα ειναι > 100 χιλ
 * Τις τιμες τισ δεινει ο χρητσης
 */
public class LightsOnApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        int speed = 0;
        final int MAX_SPEED = 100;
        boolean isRunning = false;
        boolean lightsOn = false;

        System.out.println("please insert if is raining (true/false)");
        isRaining = scanner.nextBoolean();

        System.out.println("please insert if is Dark (true/false)");
        isDark = scanner.nextBoolean();

        System.out.println("please insert car speed ");
        speed = scanner.nextInt();

        lightsOn = isRaining && (isDark || (speed > MAX_SPEED));

        System.out.println("Lights on: " + lightsOn);
    }
}
