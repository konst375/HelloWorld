package basics.Stack;

public interface Stack {
    void push(int input);
    int pop();
    int peek();
    boolean empty();
    boolean full();
    int size();
}
