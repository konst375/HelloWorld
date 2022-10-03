package basics.Stack.app;

import basics.Stack.DynamicStack;
import basics.Stack.StaticStack;

import java.util.Arrays;

public class ApplicationStack {
    public static void main(String[] args) {
        StaticStack<Integer> integerStaticStack = new StaticStack<>(10);
        DynamicStack<Double> doubleDynamicStack = new DynamicStack<>(3);
        DynamicStack<String> stringDynamicStack = new DynamicStack<>(3);

        for (int i = 0; i < 10; i++) {
            integerStaticStack.push(i);
            doubleDynamicStack.push((double) i);
            stringDynamicStack.push("i: " + i);
        }

        System.out.println(Arrays.toString(integerStaticStack.getStack()));
        System.out.println(Arrays.toString(doubleDynamicStack.getStack()));
        System.out.println(Arrays.toString(stringDynamicStack.getStack()));
    }
}
