package gr.aueb.cf.ch19.cfcollections;

public class QueueApp {
    public static void main(String[] args) {
        MyQueue<String> myQueue = new MyQueue<>();

        myQueue.enQueue("Red car");
        myQueue.enQueue("Green car");
        myQueue.enQueue("Yellow car");

        String  s = myQueue.deQueue();
        System.out.println(s + " has left the garage");

        myQueue.forEach(System.out::println);
    }
}
