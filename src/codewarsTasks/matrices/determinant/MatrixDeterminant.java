package codewarsTasks.matrices.determinant;

public class MatrixDeterminant {
    public static double det(double[][] A) {
        int length = A.length;
        if (length == 2)
            return A[0][0] * A[1][1] - A[1][0] * A[0][1];
        double[] line = A[0];
        double det = 0;
        for (int i = 0; i < line.length; i++) {
            det += (i % 2 == 0) ? line[i] * det(getMinor(A, i)) : (-1) * line[i] * det(getMinor(A, i));
        }
        return det;
    }


    private static double[][] getMinor(double[][] A, int colum) {
        int n = A.length - 1;
        double[][] a = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= colum)
                    a[i][j] = A[i + 1][j + 1];
                else
                    a[i][j] = A[i + 1][j];
            }
        }
        return a;
    }
}
