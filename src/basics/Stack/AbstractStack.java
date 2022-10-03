package basics.Stack;

abstract class AbstractStack<T> implements Stack<T> {
    private Object[] stack;
    private int top;
    private int currentSize;
    private int maxSize;

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public void setStack(Object[] stack) {
        this.stack = stack;
    }

    public Object[] getStack() {
        return stack;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public AbstractStack(int size) {
        stack = new Object[size];
        maxSize = size;
        top = -1;
    }

    @Override
    public void push(T input) {
        top = (top + 1) % maxSize;
        stack[top] = input;
        currentSize++;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T pop() {
        if (empty()) {
            System.out.println("stack is empty");
            System.exit(-1);
        }
        T x = (T) stack[top];
        top = (top - 1) % maxSize;
        currentSize--;
        return x;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T peek() {
        if (empty()) {
            System.out.println("stack is empty");
            System.exit(-1);
        }
        return (T) stack[top];
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
