package linkedList;

public class LinkedList<E> {

    private Node<E> headNode;

    private Node<E> tailNode;
    private int size = 0;

    public LinkedList() {
        Node<E> node = new Node<>();
        this.headNode = node;
        this.tailNode = node;
    }

    public void add(E element) {
        Node<E> node = new Node<E>(element);
        node.setPrev(this.tailNode);
        this.tailNode.setNext(node);
        this.tailNode = node;
        size++;
    }

    public boolean remove(int index) {
        checkElementIndex(index);

        Node<E> removeNode = getNode(index);
        Node<E> prev = removeNode.getPrev();

        Node<E> next = removeNode.getNext();

        if (index != size - 1) {
            next.setPrev(prev);
        }
        prev.setNext(next);

        this.tailNode = prev;
        this.size--;
        return true;
    }

    private Node<E> getNode(int index){
        checkElementIndex(index);
        if (index < (size / 2)) {
            Node<E> node = this.headNode.getNext();
            //System.out.println(node.getVal());
            for (int i = 0; i < index; i++) {
                node = node.getNext();
                //System.out.println(node.getVal());
            }
            return node;
        } else {
            Node<E> node = this.tailNode;
            //System.out.println(node.getVal());
            for (int i = size - 1; i > index; i--) {
                node = node.getPrev();
                //System.out.println(node.getVal());
            }
            return node;
        }
    }
    private void checkPositionIndex(int index) {
        if (index >= 0 && index <= size) {
            return;
        }
        throw new IndexOutOfBoundsException(outOfBoundsMsg(index));

    }

    public E getFirst() {
        return this.headNode.getNext().getItem();
    }

    public E getLast() {
        return this.tailNode.getItem();
    }

    private void checkElementIndex(int index) {
        if (index >= 0 && index < this.size) {
            return;
        }
        throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }

    private String outOfBoundsMsg(int index) {
        return "Index: " + index + ", Size: " + size;
    }

    public int getSize() {
        return size;
    }

    public E get(int index) {
        return getNode(index).getItem();
    }
}
