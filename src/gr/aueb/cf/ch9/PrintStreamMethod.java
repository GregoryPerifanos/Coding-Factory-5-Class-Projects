package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

/**
 * Print Stream Demo with method
 */
public class PrintStreamMethod {
    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("E:/f1.txt", StandardCharsets.UTF_8);
             PrintStream ps2 = new PrintStream("E:/f2.txt");
             PrintWriter pw = new PrintWriter("E:/f3.txt")) {
//            ps.println("Hello Coding Factory");
            printMsg(ps,"Γεία σου Καληνύχτα!!!");
            printMsg(ps2,"Hello PrintStream 2!!!");
            printMsg(System.out, "Hello Tο Std Output!!!");
            pw.println("Hello from Print Writer");
        }catch (IOException e){
//            e.printStackTrace();
            System.out.println("File Not Found");
        }
    }



    /**
     *
     * @param ps
     * @param message
     */
    public static void printMsg (PrintStream ps, String message) {
        ps.println(message);
    }
}
