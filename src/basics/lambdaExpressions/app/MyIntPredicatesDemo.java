package basics.lambdaExpressions.app;

import basics.lambdaExpressions.MyIntNum;
import basics.lambdaExpressions.MyIntPredicate;
import basics.lambdaExpressions.functionalInterfaces.IntPredicate;
import basics.lambdaExpressions.functionalInterfaces.MyIntNumPredicate;

public class MyIntPredicatesDemo {

    static boolean numTest(IntPredicate p, int n) {
        return p.test(n);
    }

    static boolean numTest(MyIntNumPredicate inp, MyIntNum in, int n) {
        return inp.test(in, n);
    }

    public static void main(String[] args) {
        System.out.println(numTest(MyIntPredicate::isPrime, 10));
        /*
        IntPredicate intPr = MyIntPredicate::isPrime;
        intPr.test(10);
        */
        System.out.println(numTest(MyIntPredicate::isEven, 5));
        System.out.println(numTest(MyIntPredicate::isPositive, 130));

        MyIntNum myIntNum = new MyIntNum(5);
        System.out.println(numTest(myIntNum::isFactor, 1));

        MyIntNumPredicate inp = MyIntNum::isFactor;
        System.out.println(inp.test(myIntNum, 3));

        System.out.println(numTest(MyIntNum::isFactor, myIntNum, 3));
    }
}
