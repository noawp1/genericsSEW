public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>(3);

        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        System.out.println("Top element (peek): " + stack.peek());

        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        System.out.println("Current size: " + stack.size());
        System.out.println("Is empty? " + stack.isEmpty());
    }
}