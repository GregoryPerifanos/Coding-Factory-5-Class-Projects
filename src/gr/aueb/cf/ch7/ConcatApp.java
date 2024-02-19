package gr.aueb.cf.ch7;

public class ConcatApp {
    public static void main(String[] args) {
        String s1 = "Coding";
        String s2 = "Factory";

        String s3 = s1.concat(" ").concat(s2);
        String s4 = s1 + " " + s2;
    }
}
