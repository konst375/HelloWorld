package basics.Queue;

public class DynamicQueue<T> extends AbstractQueue<T> {
    private static final int COEFFICIENT_OF_DILATION = 2;

    public DynamicQueue(int size) {
        super(size);
    }

    @Override
    public void push(T input) {
        if (full()) {
            increaseSizeOfQueue();
            System.out.println("queue has been extended");
        }
        super.push(input);
    }

    private void increaseSizeOfQueue() {
        int extendedSize = getMaxSize() * COEFFICIENT_OF_DILATION;
        Object [] extendedQueue = new Object[extendedSize];
        setMaxSize(extendedSize);
        System.arraycopy(getQueue(), 0, extendedQueue, 0, getQueue().length);
        super.setQueue(extendedQueue);
    }
}
