package basics.generics.genericClases.methodsArgumentTemplate;

public class NumericFns<T extends Number> {
    T ob;

    public NumericFns(T ob) {
        this.ob = ob;
    }

    T getOb() {
        return ob;
    }

    public double reciprocal() {
        return 1 / ob.doubleValue();
    }

    public double fraction() {
        return ob.doubleValue() - ob.intValue();
    }

    public boolean isAbsEqual(NumericFns<?> ob) {
        return (Math.abs(this.getOb().doubleValue()) == Math.abs(ob.getOb().doubleValue()));
    }
}
