package basics.Queue.app;

import basics.Queue.DynamicQueue;
import basics.Queue.StaticQueue;

import java.util.Arrays;

public class ApplicationQueue {
    public static void main(String[] args) {
        StaticQueue<Integer> integerStaticQueue = new StaticQueue<>(10);
        DynamicQueue<Double> doubleDynamicQueue = new DynamicQueue<>(5);
        DynamicQueue<String> stringDynamicQueue = new DynamicQueue<>(5);

        for (int i = 0; i < 10; i++) {
            integerStaticQueue.push(i);
            doubleDynamicQueue.push((double) i);
            stringDynamicQueue.push("string" + i);
        }

        System.out.println(Arrays.toString(integerStaticQueue.getQueue()));
        System.out.println(integerStaticQueue.pop());
        System.out.println(Arrays.toString(doubleDynamicQueue.getQueue()));
        System.out.println(doubleDynamicQueue.pop());
        System.out.println(Arrays.toString(stringDynamicQueue.getQueue()));
        System.out.println(stringDynamicQueue.pop());
        System.out.println(Arrays.toString(stringDynamicQueue.getQueue()));
    }
}
