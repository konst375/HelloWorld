package habrTasks.arrays.remove;

import java.util.Arrays;

class RemoveElement {
    public static void main(String[] args) {
        int[] testInt = {1, 2, 3, 4, 4, 3, 2, 8};
        System.out.println(Arrays.toString(removeElement(testInt, 3)));
        System.out.println(Arrays.toString(removeElement(testInt, 5)));
    }

    private static int[] removeElement(int[] arr, int elementToRemove) {
        return Arrays.stream(arr)
                .filter(i -> i != elementToRemove)
                .toArray();
    }
}
