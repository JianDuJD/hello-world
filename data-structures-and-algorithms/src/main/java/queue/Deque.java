package queue;

import linkedList.LinkedList;
import linkedList.Node;

public class Deque<E> {

    private LinkedList<E> linkedList = new LinkedList<>();
    private Node<E> firstNode;
    private Node<E> lastNode;
    private int size;

    public void pushLast(E element) {
        linkedList.add(size,element);
    }

    public E popLast() {
        E last = linkedList.getLast();
        linkedList.remove(size-1);
        return last;
    }

    public void pushFirst(E element) {
        linkedList.add(0,element);
    }

    public E popFirst() {
        E first = linkedList.getFirst();
        linkedList.remove(0);
        return first;
    }
}
