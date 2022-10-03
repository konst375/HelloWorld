package basics.generics.genericMethods;

class GenericMethodDemo {
    public static void main(String[] args) {
        Integer[] num = {1, 2, 3, 4, 5};
        Integer[] num1 = {1, 2, 3, 4, 5};
        Integer[] num2 = {1, 7, 3, 4, 5, 6};
        Double[] num3 = {1., 7., 3., 4., 5.};

        System.out.println(arraysEqual(num1, num));
        System.out.println(arraysEqual(num, num));
        System.out.println(arraysEqual(num2, num));
    }

    static <T extends Comparable<T>, V extends T> boolean arraysEqual(T[] x, V[] y) {
        if (x.length != y.length) {
            return false;
        }
        for (int i = 0; i < x.length; i++) {
            if (!x[i].equals(y[i])) {
                return false;
            }
        }
        return true;
    }
}
