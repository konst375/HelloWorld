package basics.generics.genericClases;

import basics.generics.genericClases.methodsArgumentTemplate.NumericFns;

public class GenDemo {
    public static void main(String[] args) {
        NumericFns<Integer> ob1 = new NumericFns<>(54);
        NumericFns<Double> ob2 = new NumericFns<>(-54.0);
        NumericFns<Long> ob3 = new NumericFns<>(54L);

        System.out.println("Absolut value equal - " + ob3.isAbsEqual(ob2));
        System.out.println(ob1.reciprocal());
    }
}
