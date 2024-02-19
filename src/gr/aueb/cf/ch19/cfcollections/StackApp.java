package gr.aueb.cf.ch19.cfcollections;

public class StackApp {
    public static void main(String[] args) {
            MyStack<Integer> intStack = new MyStack<>();

        intStack.push(1);
        intStack.push(1);
        intStack.push(1);
        intStack.push(1);
        intStack.push(1);
        intStack.push(1);

        int item = intStack.pop();

        intStack.forEach(System.out::println);
    }
}
