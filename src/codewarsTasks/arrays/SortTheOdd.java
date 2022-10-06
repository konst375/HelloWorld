package codewarsTasks.arrays;

import java.util.Arrays;

public class SortTheOdd {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray(new int[]{7, 1})));
    }

    public static int[] sortArray(int[] array) {
        int buffer;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                buffer = array[i];
                for (int j = i; j < array.length; j++) {
                    if (array[j] % 2 != 0 && buffer > array[j]) {
                        array[i] = array[j];
                        array[j] = buffer;
                        buffer = array[i];
                    }
                }
            }
        }
        return array;
    }
}
