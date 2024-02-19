package gr.aueb.cf.ch8;

import java.io.IOException;
import java.util.Arrays;
import java.util.SplittableRandom;

/**
 * Read two chars form standard input
 * and prints to console
 */
public class CharReadApp {
    public static void main(String[] args) {
        String s;

        try {
            System.out.println("please insert two chars");
            s = getString();
            System.out.println(s);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
    public static String getString() throws IOException {
        char[] tokens = new char[2];

        try {


            for (int i = 0; i < tokens.length; i++) {
                tokens[i] = (char) System.in.read();
            }
        } catch (IOException e){
            e.printStackTrace();
            throw e;
        }
        return Arrays.toString(tokens);
    }
}
