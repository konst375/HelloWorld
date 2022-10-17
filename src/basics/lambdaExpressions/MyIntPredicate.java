package basics.lambdaExpressions;

public class MyIntPredicate {

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i < n/i; i++) {
            if ((n % i) == 0)
                return false;
        }
        return true;
    }

    public static boolean isEven(int n) {
        return (n % 2) == 0;
    }

    public static boolean isPositive(int n) {
        return n > 0;
    }
}
