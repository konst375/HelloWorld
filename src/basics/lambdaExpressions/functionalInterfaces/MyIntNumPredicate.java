package basics.lambdaExpressions.functionalInterfaces;

import basics.lambdaExpressions.MyIntNum;

@FunctionalInterface
public interface MyIntNumPredicate {
    boolean test(MyIntNum min, int n);
}
