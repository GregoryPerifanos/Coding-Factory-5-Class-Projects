package gr.aueb.cf.ch7;

public class EqualityApp {
    public static void main(String[] args) {
        String s1 = "AUEB";
        String s2 = "AUEB";
        String s3 = "aueb";


        if (s1.equals(s2)){
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
        if (s1.equals(s3)) {
            System.out.println("EQUAL");
        }

        if (s1.compareToIgnoreCase(s3) < 0 ) {

        }

        s3 = s3.toUpperCase();
        s2 = s2.toUpperCase();
        String s4 = s3.toLowerCase();
        String s5 = String.valueOf('a');
    }
}
