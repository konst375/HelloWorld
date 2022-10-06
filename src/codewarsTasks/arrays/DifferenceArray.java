package codewarsTasks.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DifferenceArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2, 3, 4, 5}, new int[]{1, 3, 1}))); //must return new int[] {2, 4, 5}
    }

    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> result = new ArrayList<>();
        for (int A : a) {
            if (!isEqual(A, b)) {
                result.add(A);
            }
        }
        return result.stream()
                .mapToInt((Integer i) -> i)
                .toArray();
    }

    public static boolean isEqual(int i, int[] b) {
        for (int B : b) {
            if (i == B) {
                return true;
            }
        }
        return false;
    }
}
