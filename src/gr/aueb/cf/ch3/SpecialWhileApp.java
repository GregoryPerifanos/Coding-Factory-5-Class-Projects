package gr.aueb.cf.ch3;

/**
 * Ειδικέσ μορφές while
 * 0 φορές
 * infinite
 */
public class SpecialWhileApp {
    public static void main(String[] args) {
        int i = 1;

        while (i < 0){
            System.out.println("NEVER gets in");
        }
        while (i <= 1){
            System.out.println("Only one iteration");
        }
        while (true){
            System.out.println("Eternal while loop");
        }
    }
}
