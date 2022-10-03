package basics.Queue;

public interface Queue<T> {
    void push(T input);
    T pop();
    T peek();
    boolean empty();
    boolean full();
    int size();
}
