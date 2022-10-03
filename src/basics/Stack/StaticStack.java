package basics.Stack;

public class StaticStack<T> extends AbstractStack<T>{

    public StaticStack(int size) {
        super(size);
    }

    @Override
    public void push(T input) {
        if (full()) {
            System.out.println("stack is full");
            System.exit(-1);
        }
        super.push(input);
    }
}
