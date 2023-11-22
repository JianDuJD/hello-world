package stack;

import linkedList.Node;

import java.util.Stack;

public class LinkedStack<T> {

    private Node<T> node;

    private int size;

    public void push(T val){
        Node<T> node = new Node<T>(val);
        node.setNext(this.node);
        this.node = node;
        this.size++;
    }

    public T pop(){
        if (empty()) {
            throw new EmptyStackException();
        }
        Node<T> node = this.node;
        T val = node.getVal();

        this.node = node.getNext();

        node.setNext(null);
        node.setVal(null);
        this.size--;
        return val;
    }

    public boolean empty(){
        return this.size == 0;
    }

    public T peek(){
        if (empty()) {
            throw new EmptyStackException();
        }
        return this.node.getVal();
    }
}
