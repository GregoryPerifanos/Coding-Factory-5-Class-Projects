package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Λαμβάνει απο stdin ένα ακέραιο που
 * αναπαρηστά λίρες Σκωτίας, τις μετατρέπει
 * σε δολάρια και λεπτά USD (1$ = 100 cents)
 * και εκτυπώνει το αποτέλεσμα ως εξής, για
 * παράδειγμα: 10 λίρες Σκωτίας = xx δολάρια
 * USD και yy cents
 */
public class BankOfScotlandApp {

    public static void main(String[] args) {
        int scottishPounds = 0;
        int usdDollars = 0;
        int usdCents = 0;
        int totalUsdCents = 0;
        final int PARITY = 137;
        Scanner sacnner = new Scanner(System.in);

        System.out.println("Please insert the amount of Scotish pounds");
        scottishPounds = sacnner.nextInt();

        totalUsdCents = scottishPounds * PARITY;
        usdDollars = totalUsdCents / 100;
        usdCents = totalUsdCents % 100;

        System.out.printf("\u00A3%d (Scotish Pounds) = \u0024%d (USD Dollars) and %d USD Cents",
                scottishPounds, usdDollars, usdCents);
    }
}
