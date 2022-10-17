package examcloudsTasks.lambdaExpressions.task6;

@FunctionalInterface
public interface RandomNumberSupplier<T extends Number> {
    T get(T from, T to);
}
