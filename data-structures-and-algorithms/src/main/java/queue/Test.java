package queue;


public class Test {
    public static void main(String[] args) {
        Queue<String> stringQueue = new Queue<>();
        stringQueue.push("dujian");
        stringQueue.push("tangguoqiang");

        System.out.println(stringQueue.peek());
    }
}
