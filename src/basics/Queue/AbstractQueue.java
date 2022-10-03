package basics.Queue;

abstract class AbstractQueue<T> implements Queue<T> {
    private Object[] queue; //main array
    private int head; // the first element of the queue
    private int tail; // the last element of queue
    private int currentSize; //how much element in queue now
    private int maxSize; //max size of queue

    void setQueue(Object[] queue) {
        this.queue = queue;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public Object[] getQueue() {
        return queue;
    }

    public int getHead() {
        return head;
    }

    public int getTail() {
        return tail;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public AbstractQueue(int size) {
        queue = new Object[size];
        maxSize = size;
        head = 0;
        tail = -1;
    }

    @SuppressWarnings("unchecked")
    public T peek() {
        if (empty()) {
            System.out.println("queue is empty");
            System.exit(-1);
        }
        return (T) queue[head];
    }

    public boolean empty() {
        return (size() == 0);
    }

    public boolean full() {
        return (size() == maxSize);
    }

    public int size() {
        return currentSize;
    }

    public void push(T input) {
        tail = (tail + 1) % maxSize;
        queue[tail] = input;
        currentSize++;
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        if (empty()) {
            System.out.println("queue is empty");
            System.exit(-1);
        }
        T x = (T) queue[head];
        head = (head + 1) % maxSize;
        currentSize--;
        return x;
    }
}
