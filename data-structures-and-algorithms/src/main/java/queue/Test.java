package queue;


import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        Deque<String> stringDeque = new Deque<>();
        stringDeque.pushFirst("du");
        stringDeque.pushFirst("11");
        System.out.println(stringDeque.popFirst());
        System.out.println(stringDeque.popFirst());
    }
}
