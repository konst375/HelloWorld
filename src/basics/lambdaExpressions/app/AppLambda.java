package basics.lambdaExpressions.app;

import basics.lambdaExpressions.ChangeString;
import basics.lambdaExpressions.functionalInterfaces.*;

public class AppLambda {
    public static void main(String[] args) {

        GettingDoubleValue gettingDoubleValue = v -> 1 / v;
        GettingDoubleValue gettingDoubleValue1 = v -> v * v;
        System.out.println(gettingDoubleValue.getValue(5));
        System.out.println(gettingDoubleValue1.getValue(5));

        GettingIntegerValue gettingIntegerValue = n -> {
            int result = 1;
            n = n < 0 ? -n : n;

            for (int i = 2; i < n / i; i++) {
                if ((n % i) == 0) {
                    return i;
                }
            }
            return result;
        };
        System.out.println(gettingIntegerValue.getValue(543));
        System.out.println(gettingIntegerValue.getValue(-15));


        GettingValue<Double> gettingValue = n -> 1 / n;
        System.out.println(gettingValue.getValue(5.6));

        GettingValue<Double> gettingValue1 = n -> n * n;
        System.out.println(gettingValue1.getValue(5.6));

        GettingValue<Integer> gettingValue3 = n -> {
            int result = 1;
            n = n < 0 ? -n : n;

            for (int i = 2; i < n / i; i++) {
                if ((n % i) == 0) {
                    return i;
                }
            }
            return result;
        };
        System.out.println(gettingValue3.getValue(133));

        String inputString = "lambda expressions expand java";

        GettingString reverse = s -> {
            StringBuilder result = new StringBuilder();

            for (int i = s.length() - 1; i >= 0; i--) {
                result.append(s.charAt(i));
            }
            return String.valueOf(result);
        };
        System.out.println(ChangeString.changeString(reverse, inputString));

        System.out.println(ChangeString.changeString(s -> s.replace(" ", "-"), inputString));

        GettingString changeCase = s -> {
            StringBuilder result = new StringBuilder();
            char ch;

            for (int i = 0; i < s.length(); i++) {
                ch = s.charAt(i);
                result.append(Character.isUpperCase(ch) ? Character.toLowerCase(ch) : Character.toUpperCase(ch));
            }
            return String.valueOf(result);
        };
        System.out.println(ChangeString.changeString(changeCase, inputString));


        Integer integer = 5;

        ChangeInt changeInt = n -> integer + n;
        System.out.println(changeInt.changeInt(8));
    }
}
