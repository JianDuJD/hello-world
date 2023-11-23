package queue;

import linkedList.Node;

public class Queue<T> {

    private Node<T> headNode;
    private Node<T> tailNode;

    public void push(T val){
        Node<T> tNode = new Node<>(val);
        if (this.headNode == null) {
            this.headNode = tNode;
            this.tailNode = tNode;
            return;
        }
        this.tailNode.setNext(tNode);
        this.tailNode = tNode;
    }

    public T pop(){
        if (headNode == null) {

        }
        Node<T> headNode = this.headNode;
        T val = headNode.getVal();
        Node<T> next = headNode.getNext();

        headNode.setVal(null);
        headNode.setNext(null);

        this.headNode = next;


        return val;
    }

    public T peek(){
        return this.headNode.getVal();
    }
}
