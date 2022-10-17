package examcloudsTasks.lambdaExpressions.task4;

import java.util.function.Consumer;

public class HeavyBoxApp {
    public static void main(String[] args) {
        Consumer<HeavyBox> shipHeavyBox = box -> System.out.println("shipped a heavy box with a weight " + box.weight());
        Consumer<HeavyBox> sendHeavyBox = box -> System.out.println("sending a heavy box with a weight " + box.weight());
        shipHeavyBox.andThen(sendHeavyBox).accept(new HeavyBox(10));
    }
}
