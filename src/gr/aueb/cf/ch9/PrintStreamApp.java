package gr.aueb.cf.ch9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 *
 */
public class PrintStreamApp {
    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("E:/f1.txt")) {
            ps.println("Hello Coding Factory");
        }catch (FileNotFoundException e){
//            e.printStackTrace();
            System.out.println("File Not Found");
        }
    }
}
