package examcloudsTasks.lambdaExpressions.task6;

import java.util.Random;
import java.util.function.Supplier;

public class RandomNumber {
    public static void main(String[] args) {
        Supplier<Integer> getRandomNumber = () -> {
            Random random = new Random();
            return random.nextInt(0, 10);
        };
        System.out.println(getRandomNumber.get());

        RandomNumberSupplier<Double> getNextRandomDouble = (from, to) -> {
            Random random = new Random();
            return random.nextDouble(from, to);
        };
        System.out.println(getNextRandomDouble.get(0., 10.));
    }
}
