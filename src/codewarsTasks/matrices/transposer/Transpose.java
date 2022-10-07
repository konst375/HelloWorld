package codewarsTasks.matrices.transposer;

public class Transpose {
    public static double[][] transposeM(double[][] M) {
        int lines = M.length;
        int columns = M[0].length;
        double[][] transposedM = new double[columns][lines];
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                transposedM[j][i] = M[i][j];
            }
        }
        return transposedM;
    }
}
