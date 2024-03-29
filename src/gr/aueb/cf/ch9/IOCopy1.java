package gr.aueb.cf.ch9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Copies a jpj/png byte by byte with FileInputStream read()
 */
public class IOCopy1 {
    public static void main(String[] args) {
        int b;
        int count = 0;
        long start;
        long end;
        long elapsedTime;

        try (FileInputStream in = new FileInputStream("E:/aueb.jpg");
             FileOutputStream out = new FileOutputStream("E:/aoueb-out.jpg")) {


            start = System.nanoTime();
            while ((b = in.read()) != -1) {
                out.write(b);
                count++;
            }
            end = System.nanoTime();
            elapsedTime = end - start;
            System.out.printf("The file with %d KBytes (%d bytes) copied\n", count / 1024, count);
            System.out.printf("Elapsed Time: %2f seconds", elapsedTime / 1_000_000_000.0);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
