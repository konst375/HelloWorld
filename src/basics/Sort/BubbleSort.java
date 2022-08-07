package basics.Sort;

import java.util.Arrays;

public class BubbleSort {
    int[] array;

    BubbleSort(int[] inputArray) {
        this.array = inputArray;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.array);
    }

    public void sortByBubbleSmallBig() {
        int buffer;
        for (int j = 0; j < this.array.length; j++) {
            for (int i = 0; i < this.array.length-1; i++) {
                if (this.array[i] > this.array[i+1]) {
                    buffer = this.array[i+1];
                    this.array[i+1] = this.array[i];
                    this.array[i] = buffer;
                }
            }
        }
    }

    public void sortByBubbleBigSmall() {
        boolean isSorted = false;
        int buffer;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < this.array.length - 1; i++) {
                if (this.array[i] < this.array[i+1]) {
                    isSorted = false;
                    buffer = this.array[i+1];
                    this.array[i+1] = this.array[i];
                    this.array[i] = buffer;
                }
            }
        }
    }
}