package examcloudsTasks.lambdaExpressions.task5;

import java.util.function.Function;

public class WitchNumber {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Function<Integer, String> witchNumber = n -> {
            sb.append(n);
            if (n > 0)
                return String.valueOf(sb.append(" - More then zero"));
            if (n < 0)
                return String.valueOf(sb.append(" - Less than zero"));
            return String.valueOf(sb.append(" - is zero"));
        };
        System.out.println(witchNumber.apply(0));
    }
}
