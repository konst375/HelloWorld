package basics.generics.genericClases;

public class TwoGen<T extends Number, V> {
    T ob1;
    V ob2;

    TwoGen(T ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    T getOb1() {
        return ob1;
    }

    V getOb2() {
        return ob2;
    }

    void showType() {
        System.out.println("ob1 " + ob1.getClass().getName() + "\nob2 " + ob2.getClass().getName());
    }
}
