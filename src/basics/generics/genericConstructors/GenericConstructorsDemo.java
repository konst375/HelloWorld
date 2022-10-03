package basics.generics.genericConstructors;

public class GenericConstructorsDemo {
    public static void main(String[] args) {
        Summation ob1 = new Summation(5);
        Summation ob2 = new Summation(5.9F);

        System.out.println(ob1.getIntSum());
        System.out.println(ob2.getIntSum());
    }
}
