package gr.aueb.cf.ch19.dilst;

public class DoublyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;


    public DoublyLinkedList() {
        head = tail = null;
    }


    public void insetFront(T t) {
        Node<T> tmp = new Node<>();
        tmp.setValue(t);
        tmp.setNext(head);
        tmp.setPrev(null);

        head = tmp;
        if (tmp.getNext() == null)  {
            tail = tmp;
        }else {
            tmp.getNext().setPrev(tmp);
        }
    }

    public void insetEnd(T t) {
        Node<T> tmp = new Node<>();
        tmp.setValue(t);
        tmp.setNext(null);
        tmp.setPrev(tail);

        tail = tmp;
        if (tmp.getNext() == null)  {
            head = tmp;
        }else {
            tmp.getPrev().setNext(tmp);
        }
    }


    public void deleteFront() {
        //if (isEmpty() return;)
        if (head.getNext() == null) {
            head = tail = null;
        }else {
            head = head.getNext();
            head.setPrev(null);
        }
    }

    public void deleteEnd() {
        //if (isEmpty() return;)
        if (tail.getPrev() == null) {
            head = tail = null;
        }else {
            tail = tail.getPrev();
            tail.setNext(null);
        }
    }

    public Node<T> get(T t) {
        for (Node<T> p = head; p != null; p = p.getNext()) {
            if (p.getValue().equals(t)) {
                return p;
            }
        }
        return null;
    }

    public void traverse()  {
        for (Node<T> p = head; p != null; p = p.getNext()) {
            System.out.println(p);
        }
    }


    public boolean isEmpty() {
        return (head == null) && (tail == null);
    }

    public int size() {
        int counter = 0;
        for (Node<T> p = head; p != null; p = p.getNext()) {
            counter++;
        }
        return counter;
    }
}
