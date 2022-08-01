package basics.Queue;

public class StaticQueue extends AbstractQueue{
    public StaticQueue(int size) {
        super(size);
    }

    @Override
    public void push(int input) {
        if (full()) {
            System.out.println("queue is full");
            System.exit(-1);
        }
        super.push(input);
    }
}