package codewarsTasks.matrices.app;

import codewarsTasks.matrices.determinant.MatrixDeterminant;

public class ArrayApp {
    public static void main(String[] args) {
        double x = MatrixDeterminant.det(new double[][] {
                {2, 2, 2, 5},
                {1, 2, 2, 8},
                {1, 2, 3, 19},
                {1, 2, 3, 85}
        });
        System.out.println(x);
    }
}
