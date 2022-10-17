package basics.lambdaExpressions.functionalInterfaces;

@FunctionalInterface
public interface GettingValue<T> {
    T getValue(T n);
}
