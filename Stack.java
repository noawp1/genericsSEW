public class Stack<T> {
    private Object[] elements;
    private int top;
    private int capacity;

    @SuppressWarnings("unchecked")
    public Stack(int capacity) {
        this.capacity = capacity;
        this.top = -1;
        this.elements = new Object[capacity];
    }

    public void push(T item) {
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }
        top++;
        elements[top] = item;
    }
    @SuppressWarnings("unchecked")
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T value = (T) elements[top];
        elements[top] = null;
        top--;
        return value;
    }
    @SuppressWarnings("unchecked")
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return (T) elements[top];
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == capacity - 1;
    }
    public int size() {
        return top + 1;
    }
}
