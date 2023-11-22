package stack;

public class Test {
    public static void main(String[] args) {
        LinkedStack<String> linkedStack = new LinkedStack<>();
        linkedStack.push("du");
        linkedStack.push("jian");
        System.out.println(linkedStack.pop());
        System.out.println(linkedStack.pop());
        System.out.println(linkedStack.pop());
    }
}
