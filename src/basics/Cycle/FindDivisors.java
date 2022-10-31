package basics.Cycle;

import java.util.ArrayList;
import java.util.List;

public class FindDivisors {
    private static final Integer ZERO = 0;

    public List<Integer> findDivisorsByNumber(Integer number) {
        List<Integer> allDivisors = new ArrayList<>();
        Integer divider = 1;
        while (divider < number) {
            if (number % divider == ZERO) {
                allDivisors.add(divider);
            }
            divider++;
        }
        return allDivisors;
    }
}