package basics.Stack;

abstract class AbstractStack implements Stack {
    private final int[] stack;
    private int top;
    private int currentSize;
    private final int maxSize;

    public AbstractStack(int size) {
        stack = new int[size];
        maxSize = size;
        top = - 1;
    }

    @Override
    public void push(int input) {
        top = (top + 1) % maxSize;
        stack[top] = input;
        currentSize++;
    }

    @Override
    public int pop() {
        if (empty()) {
            System.out.println("stack is empty");
            System.exit(-1);
        }
        int x = stack[top];
        top = (top - 1) % maxSize;
        currentSize--;
        return x;
    }

    @Override
    public int peek() {
        if (empty()) {
            System.out.println("stack is empty");
            System.exit(-1);
        }
        return stack[top];
    }

    @Override
    public boolean empty() {
        return size() == 0;
    }

    @Override
    public boolean full() {
        return size() == maxSize;
    }

    @Override
    public int size() {
        return currentSize;
    }
}
