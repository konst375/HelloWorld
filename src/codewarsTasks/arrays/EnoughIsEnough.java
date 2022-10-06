package codewarsTasks.arrays;


import java.util.*;

public class EnoughIsEnough {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(deleteNth(new int[]{1, 1, 1, 1, 3, 3, 7, 2, 2, 2, 2}, 2)));
    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        Map<Integer, Integer> quantityOccurrences = new HashMap<>();
        for (int element : elements) {
            if (quantityOccurrences.containsKey(element)) {
                quantityOccurrences.put(element, quantityOccurrences.get(element) + 1);
            } else {
                quantityOccurrences.put(element, 1);
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int element : elements) {
            if (quantityOccurrences.get(element) > maxOccurrences) {
                quantityOccurrences.put(element, maxOccurrences);
            }
            if (quantityOccurrences.get(element) > 0) {
                result.add(element);
                quantityOccurrences.put(element, quantityOccurrences.get(element) - 1);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}
