package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class PrintAutoFlushApp {
    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream(new FileOutputStream("E:/f4.txt", true), true, StandardCharsets.UTF_8)) {
            ps.println("Hello Coding Factory");
        }catch (FileNotFoundException e){
//            e.printStackTrace();
            System.out.println("File Not Found");
        }
    }
}
