package basics.generics.genericClases;

public class Gen<T> {
    T ob;

    Gen(T ob) {
        this.ob = ob;
    }

    T getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Type T is " + ob.getClass().getName());
    }
}
