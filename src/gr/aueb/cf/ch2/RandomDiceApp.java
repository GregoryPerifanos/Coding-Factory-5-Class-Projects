package gr.aueb.cf.ch2;

public class RandomDiceApp {
    public static void main(String[] args) {
        int die1 = (int) (Math.random() * 6) + 1;
        int die2 = (int) (Math.random() * 6) + 1;
        System.out.printf("Ρίξε μια καλη ζαρια και για μενα ρε ζωη %d,%d", die1, die2);
    }
}
