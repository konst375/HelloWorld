package basics.Stack;

public interface Stack<T> {
    void push(T input);
    T pop();
    T peek();
    boolean empty();
    boolean full();
    int size();
}
