package habrTasks.equations.app;

import habrTasks.equations.bisectionMethod.BisectionMethod;

public class EquationsApp {
    public static void main(String[] args) {
        double root = BisectionMethod.findRootWithAnAccuracy(0, 10, 0.001);
        System.out.println(root);
    }
}
