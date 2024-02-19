package gr.aueb.cf.ch14;

public class CodingFactory {
    private static final CodingFactory INSTANCE = new CodingFactory();

    private CodingFactory(){

    }

    public static CodingFactory getInstance() {
    return INSTANCE;
    }

    public void sayHi() {
        System.out.println("Hi Only One Coding Factory");
    }

}
