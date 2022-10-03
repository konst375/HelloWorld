package basics.generics.genericInterface;

public class MyClass<T extends Number> implements Containment<T>{
    T[] o;

    MyClass(T[] o) {
        this.o = o;
    }

    @Override
    public boolean contains(T o) {
        for (T ob : this.o) {
            if (o.equals(ob)) {
                return true;
            }
        }
        return false;
    }
}
