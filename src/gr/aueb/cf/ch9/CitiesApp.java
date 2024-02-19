package gr.aueb.cf.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Reads from a file where in each line  has the form
 * City Town1 Town2
 * And returns as many files as the towns
 */
public class CitiesApp {
    public static void main(String[] args) {
        String line = "";
        String[] cities;
        File dir = new File("E:/io");

        if (!dir.exists()) {
            if (!dir.mkdir()) {
                System.err.println("Error in make dri");
                System.exit(1);
            }
        }
        try (BufferedReader bf = new BufferedReader(new FileReader("E:/cities.txt"))) {

            while ((line = bf.readLine()) != null) {
                cities = line.split(" +");
                switch (cities[0]) {
                    case "Greece":
                        File grFile = new File(dir + "/" + "gr.txt");
                        PrintStream psGr = new PrintStream(grFile, StandardCharsets.UTF_8);
                        printTitle(psGr, "Gre Cities");
                        printTokens(psGr, cities);

                    case "USA":
                        File usaFile = new File(dir + "/" + "usa.txt");
                        PrintStream psUsa = new PrintStream(usaFile, StandardCharsets.UTF_8);
                        printTitle(psUsa, "USA Cities");
                        printTokens(psUsa, cities);

                    case "Germany":
                        File deFile = new File(dir + "/" + "de.txt");
                        PrintStream psDe = new PrintStream(deFile, StandardCharsets.UTF_8);
                        printTitle(psDe, "Germany Cities");
                        printTokens(psDe, cities);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public static void printTokens(PrintStream ps, String[] tokens){
        for (int i = 0; i < tokens.length; i++) {
            ps.print(tokens[i] + " ");
        }
    }
    public static void printTitle(PrintStream ps, String title) {
        ps.print(title);
    }
}
