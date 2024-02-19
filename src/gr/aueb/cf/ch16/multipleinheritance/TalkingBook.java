package gr.aueb.cf.ch16.multipleinheritance;

public class TalkingBook implements ISpeakable,IReadable{
    @Override
    public void read() {
        System.out.println("Can Read");
    }

    @Override
    public void speakable() {
        System.out.println("Can Speak");
    }
}
