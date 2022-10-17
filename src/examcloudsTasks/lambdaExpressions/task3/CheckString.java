package examcloudsTasks.lambdaExpressions.task3;

import java.util.function.Predicate;

public class CheckString {
    public static void main(String[] args) {
        //Check the string starts with J or N and ends with A
        Predicate<String> isStartWithJ = str -> str.startsWith("J");
        Predicate<String> isStartWithN = str -> str.startsWith("N");
        Predicate<String> start = isStartWithJ.or(isStartWithN);
        Predicate<String> isEndWithA = str -> str.endsWith("A");
        Predicate<String> isSatisfied = start.and(isEndWithA);
        System.out.println(isSatisfied.test("NoeA"));

        Predicate<String> stringSatisfiesCondition = str -> (str.startsWith("J") || str.startsWith("N")) && str.endsWith("A");
        System.out.println(stringSatisfiesCondition.test("NoeA"));

    }
}
