package gr.aueb.cf.ch3;

/**
 * Υπολογιζει το 1+2+..+10
 * με while do
 */
public class Sum10 {
    public static void main(String[] args) {
        int i = 1;
        int result = 0;

        while (i <= 10) {
            result = result +i;
            i++;
        }
        System.out.println("Sum: "+ result);
    }
}
