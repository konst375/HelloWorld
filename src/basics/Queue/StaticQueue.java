package basics.Queue;

public class StaticQueue<T> extends AbstractQueue<T>{
    public StaticQueue(int size) {
        super(size);
    }

    @Override
    public void push(T input) {
        if (full()) {
            System.out.println("queue is full");
            System.exit(-1);
        }
        super.push(input);
    }
}