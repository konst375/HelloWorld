package basics.Cycle;

import java.util.Comparator;
import java.util.List;

public class NumberUtils {
    private final List<Integer> numbers;
    private static final Integer START_VALUE = 0;

    public NumberUtils(List<Integer> input) {
        this.numbers = input;
    }

    public Integer getMinimalValue() {
        Integer minValue = this.numbers.get(START_VALUE);
        for (int i=0; i <= this.numbers.size()-1; ++i) {
            Integer currentValue = this.numbers.get(i);
            if (minValue > currentValue) {
                minValue = currentValue;
            }
        }
        return minValue;
    }

    public Integer getMinimalValueV2() {
        int minValue = this.numbers.get(START_VALUE);
        for (int number : this.numbers) {
            if (minValue > number) {
                minValue = number;
            }
        }
        return minValue;
    }

    public Integer getMinimalValueV3() {
        return this.numbers.stream()
                .min(Comparator.naturalOrder())
                .orElse(START_VALUE);
    }

//    public Integer bubbleSort() {
//        Integer firstElement = this.numbers.get(START_VALUE);
//        for (Integer number : this.numbers) {
//            if (firstElement > number) {
//
//            }
//        }
//    }
}