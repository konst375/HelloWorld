package habrTasks.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class RemoveElement {
    public static void main(String[] args) {
        int[] testInt = {1, 2, 3, 4, 4, 3, 2, 8};
        System.out.println(Arrays.toString(removeElement(testInt, 3)));
    }

    private static int[] removeElement(int[] arr, int elementToRemove) {
        List<Integer> result = new ArrayList<>();
        for (int el : arr) {
            if (!(el == elementToRemove)) {
                result.add(el);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}
