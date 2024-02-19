package gr.aueb.cf.ch1;

/**
 * Προσθέτει δυο ακεραίους και εμφανίζει
 * το αποτέλεσμα στην κονσόλα.
 */
public class AddApp {
    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        int num1 = 10;
        int num2 = 20;
        int result = 0;

        // Εντολές
        result = num1 + num2;

        // Εμφάνηση αποτελεσμάτων
        System.out.println("Το αποτέλεσμα των " + num1 + " και " + num2 + " ειναι: " + result);
        System.out.printf("Το αποτέλεσμα των %d και %d ειναι: %d\n" ,num1,num2 ,result);
    }
}
