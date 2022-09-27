package habrTasks.vector;

import java.util.Arrays;

public class VectorApp {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Vector.randomVectors(3)));
        Vector vector1 = new Vector(1, 2, 3);
        Vector vector2 = new Vector(2, 2, 3);
        System.out.println(vector1.vectorProduct(vector2));
    }
}
