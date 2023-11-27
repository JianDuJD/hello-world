package stack;

import linkedList.LinkedList;
import linkedList.Node;

import java.util.Stack;

public class LinkedStack<E> {

    private LinkedList<E> linkedList;

    public void push(E val) {
        this.linkedList.add(val);
    }

    public E pop() {
        E e = peek();
        this.linkedList.remove(linkedList.getSize() - 1);
        return e;
    }

    public boolean empty() {
        return this.linkedList.getSize() == 0;
    }

    public E peek() {
        E e = peek();
        this.linkedList.remove(linkedList.getSize() - 1);
        return e;
    }
}
