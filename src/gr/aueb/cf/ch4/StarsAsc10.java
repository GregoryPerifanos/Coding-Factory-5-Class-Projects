package gr.aueb.cf.ch4;

/**
 * prints 1 star 1sts row
 * 2stars 2nd row ect
 */
public class StarsAsc10 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
