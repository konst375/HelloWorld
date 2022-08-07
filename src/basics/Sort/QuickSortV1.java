package basics.Sort;

public class QuickSortV1 {
    public static void quickSort(int[] inputArray) {
        qSort(inputArray, 0, inputArray.length - 1);
    }

    private static void qSort(int[] array, int left, int right) {
        int i, j;
        int pivotValue, buffer;
        i = left;
        j = right;
        pivotValue = array[(left + right) / 2];

        do {
            while ((array[i] < pivotValue) && (i < right)) {
                i++;
            }
            while ((pivotValue < array[j]) && (j > left)) {
                j--;
            }
            if (i <= j) {
                buffer = array[i];
                array[i] = array[j];
                array[j] = buffer;
                i++;
                j--;
            }
        } while (i <= j);

        if (left < j) {
            qSort(array, left, j);
        }
        if (i < right) {
            qSort(array, i, right);
        }
    }
}
