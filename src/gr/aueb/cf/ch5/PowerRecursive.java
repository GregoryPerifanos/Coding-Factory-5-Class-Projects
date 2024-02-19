package gr.aueb.cf.ch5;

public class PowerRecursive {
    public static void main(String[] args) {

    }


    public static int power(int a, int n) {
        return (a == 0) ? 1 : a * power(a, n - 1);


        /* if ( n == 0) {
             return 1;
         }

         return a * power(a, n-1);*/

    }
}
