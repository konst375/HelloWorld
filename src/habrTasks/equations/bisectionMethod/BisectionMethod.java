package habrTasks.equations.bisectionMethod;

import static java.lang.Math.cos;
import static java.lang.Math.pow;

public class BisectionMethod {

    public static double findRootWithAnAccuracy(double a, double b, double accuracy) {

        if ((b - a) <= accuracy)
            return a;

        double x = (a + b) / 2;
/*
        use this condition if you want max accuracy
        if (x == a || x == b)
            return x;
*/
        if ((function(a) * function(x)) < 0) {
            return findRootWithAnAccuracy(a, x, accuracy);
        } else {
            return findRootWithAnAccuracy(x, b, accuracy);
        }
    }

    private static double function(double x) {
        return cos(pow(x, 5)) + pow(x, 4) - 345.3 * x - 23;
    }
}
