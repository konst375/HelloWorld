package basics.Queue;

public class DynamicQueue extends AbstractQueue {
    private static final int COEFFICIENT_OF_DILATION = 2;

    public DynamicQueue(int size) {
        super(size);
    }

    @Override
    public void push(int input) {
        if (full()) {
            increaseSizeOfQueue();
            System.out.println("queue has been extended");
        }
        super.push(input);
    }

    private void increaseSizeOfQueue() {
        int extendedSize = getMaxSize() * COEFFICIENT_OF_DILATION;
        int [] extendedQueue = new int[extendedSize];
        setMaxSize(extendedSize);
        System.arraycopy(getQueue(), 0, extendedQueue, 0, getQueue().length);
        setQueue(extendedQueue);
    }
}
