package habrTasks.arrays.swap;

import java.util.Arrays;
import java.util.HashMap;

public class SwapArray {
    public static void main(String[] args) {
        String[] string = {"Mom", "Dad", "Son", "Daughter", "Brother"};
        int length = string.length;
        for (int i = 0, j = length - 1; i < length >> 1; i++, j--) {
            String buffer = string[i];
            string[i] = string[j];
            string[j] = buffer;
        }
        System.out.println(Arrays.toString(string));
    }
}
