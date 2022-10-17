package examcloudsTasks.lambdaExpressions.task2;

import java.util.Objects;
import java.util.function.Predicate;

public class checkEmptyString {
    public static void main(String[] args) {
        //Check the string for empty
        Predicate<String> isEmpty = String::isEmpty;
        System.out.println(isEmpty.test("hook"));
        //Check the string for null
        Predicate<String> isNull = Objects::isNull;
        System.out.println(isNull.test("string"));
        //Check the string for empty and null
        System.out.println(isEmpty.and(isNull));
    }
}
