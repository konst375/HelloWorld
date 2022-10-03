package habrTasks.binarySearch;

import java.util.Arrays;

class BinarySearch {
    public static void main(String[] args) {
        double[] array = generateRandomArray(1000);
        Arrays.sort(array);
        double key = Math.random();

        System.out.println(bruteForce(array, key) >= 0);
        System.out.println(binarySearch0(array, 0, array.length, key) >= 0);
        System.out.println(binarySearch1(array, 0, array.length, key) >= 0);
    }

    public static int bruteForce(double[] array, double key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key)
                return i;
        }
        return -1;
    }

    private static double[] generateRandomArray(int length) {
        double[] array = new double[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        return array;
    }

    private static int binarySearch0(double[] array, int fromIndex, int toIndex, double key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            double midVal = array[mid];

            if (midVal > key) {
                high = mid - 1;
            } else if (midVal < key) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    private static int binarySearch1(double[] array, int fromIndex, int toIndex, double key) {
        int low = fromIndex;
        int high = toIndex - 1;
        int mid = (low + high) >>> 1;
        double midVal = array[mid];

        if (high < low) {
            return -1;
        }

        if (midVal > key) {
            high = mid - 1;
            return binarySearch1(array, low, high, key);
        } else if (midVal < key) {
            low = mid + 1;
            return binarySearch1(array, low, high, key);
        } else {
            return mid;
        }
    }
}