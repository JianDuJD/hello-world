package queue;

import linkedList.LinkedList;
import linkedList.Node;

public class Queue<E> {

    private LinkedList<E> linkedList;

    public Queue() {
        linkedList = new LinkedList<E>();
    }

    public void push(E val){
        this.linkedList.add(val);
    }

    public E pop(){
        E e = peek();
        this.linkedList.remove(linkedList.getSize()-1);
        return e;
    }

    public boolean hasNext(){
        return this.linkedList.getSize() > 0;
    }

    public E peek(){
        return this.linkedList.get(this.linkedList.getSize() - 1);
    }


}
