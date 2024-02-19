package gr.aueb.cf.ch2;

import java.util.Locale;
import java.util.Scanner;

/**
 * Λαμβάνει τρεις ακεραίους (hours, minutes, seconds)
 * από το stdin, μετατρέπει σε seconds και εκτυπώνει
 * το σύνολο των δευτερολέπτων
 */
public class DateToSecondApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputHours = 0;
        int inputMinutes = 0;
        int inputSeconds = 0;
        int totalSecontds = 0;
        final int SECS_PER_HOUR = 3600;
        final int SECS_PER_MINUTES = 60;

        System.out.println("Please insert hours, minutes, seconds (ints)");
        inputHours =scanner.nextInt();
        inputMinutes = scanner.nextInt();
        inputSeconds = scanner.nextInt();

    totalSecontds = inputHours *SECS_PER_HOUR + inputMinutes + SECS_PER_MINUTES + inputSeconds;

    System.out.printf("%02d hours, %02d minutes, %02d seconds = %,d total seconds",
            inputHours, inputMinutes, inputSeconds, totalSecontds);

    }
}
