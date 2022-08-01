package basics.Queue;

public interface Queue {
    void push(int input);
    int pop();
    int peek();
    boolean empty();
    boolean full();
    int size();
}
