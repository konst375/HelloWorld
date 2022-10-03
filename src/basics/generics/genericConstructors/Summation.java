package basics.generics.genericConstructors;

class Summation {
    int sum;

    <T extends Number> Summation(T ob) {
        sum = 0;
        for (int i = 0; i < ob.intValue(); i++) {
            sum += i;
        }
    }

    public double getIntSum() {
        return sum;
    }
}
