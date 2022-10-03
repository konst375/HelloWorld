package basics.generics.genericInterface;

public interface Containment<T extends Number> {
    boolean contains(T o);
}
