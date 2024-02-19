package gr.aueb.cf.ch7;

/**
 * traverse a string and
 * print char by char.
 */
public class StringAccessApp {

    public static void main(String[] args) {
        String s = "Coading Factory";

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
        System.out.println();

        for (int i = s.length() - 1; i >= 0; i--){
            System.out.print(s.charAt(i) + " ");
        }
    }

}
