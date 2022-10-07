package codewarsTasks.matrices.app;

import codewarsTasks.matrices.determinant.MatrixDeterminant;

public class ArrayApp {
    public static void main(String[] args) {
        double x = MatrixDeterminant.calculateDeterminant(new double[][] {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}
        });
        System.out.println(x);
    }
}
