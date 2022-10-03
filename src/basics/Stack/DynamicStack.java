package basics.Stack;

public class DynamicStack<T> extends AbstractStack<T> {
    private static final int COEFFICIENT_OF_DILATION = 2;

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public void push(T input) {
        if (full()) {
            increaseSizeOfStack();
            System.out.println("stack has been extended");
        }
        super.push(input);
    }

    private void increaseSizeOfStack() {
        int extendedSize = size() * COEFFICIENT_OF_DILATION;
        Object[] extendedStack = new Object[extendedSize];
        setMaxSize(extendedSize);
        System.arraycopy(getStack(), 0, extendedStack, 0, getStack().length);
        setStack(extendedStack);
    }
}
