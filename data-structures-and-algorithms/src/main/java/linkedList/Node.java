package linkedList;

public class Node<T> {

    private T val;
    private Node<T> next;

    public Node(T val){
        this.val = val;
    };

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
