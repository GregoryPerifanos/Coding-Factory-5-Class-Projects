package gr.aueb.cf.ch17.threads;

public class Main {

    private final static Runnable grimhold = new Knight("Grimhold");
    private final static Runnable darkKnight = new Knight("Bat Man");
    private final static Runnable saintGeorge = new Knight("Saint George");

    public static void main(String[] args) {
        (new Thread(grimhold)).start();
        (new Thread(darkKnight)).start();
        (new Thread(saintGeorge)).start();
    }
}
