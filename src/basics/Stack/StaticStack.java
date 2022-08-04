package basics.Stack;

public class StaticStack extends AbstractStack{

    public StaticStack(int size) {
        super(size);
    }

    @Override
    public void push(int input) {
        if (full()) {
            System.out.println("stack is full");
            System.exit(-1);
        }
        super.push(input);
    }
}
