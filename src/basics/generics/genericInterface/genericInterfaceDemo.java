package basics.generics.genericInterface;

public class genericInterfaceDemo {
    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 4, 6, 7, 9};
        MyClass<Integer> ob1 = new MyClass<>(intArr);

        System.out.println(ob1.contains(4));
    }
}
