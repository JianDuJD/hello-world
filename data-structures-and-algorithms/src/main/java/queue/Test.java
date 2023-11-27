package queue;


import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        Queue<String> stringQueue = new Queue<>();
        stringQueue.push("dujian");
        stringQueue.push("tangguoqiang");

        while (stringQueue.hasNext()){
            System.out.println(stringQueue.pop());
        }
    }
}
