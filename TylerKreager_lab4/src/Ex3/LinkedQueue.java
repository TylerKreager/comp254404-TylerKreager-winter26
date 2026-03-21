package Ex3;

import java.util.Stack;

public class LinkedQueue<E> implements Queue<E> {
    public SinglyLinkedList<E> list = new SinglyLinkedList<>();
    public LinkedQueue(){}
    public int size() {return list.size();}
    public boolean isEmpty() {return list.isEmpty(); }
    public void enqueue(E element) {list.addLast(element);}
    public E first() {return list.first(); }
    public E dequeue() {return list.removeFirst(); }

    public void concatenate(LinkedQueue<E> Q2) {

        this.list.getTail().setNext(Q2.list.getHead());

        this.list.setTail(Q2.list.getTail());

        this.list.addSize(Q2.list.size());

        Q2.list.clear();
    }

    public String toString() {
        return list.toString();
    }
}
