package basics.baseOOP;

public class RandomFromArray {
    private int[] values;
    private int[] weights;
    private int[] array;

    public RandomFromArray(int[] values, int[] weights) {
        this.values = values;
        this.weights = weights;
        array = new int[values.length + weights.length];
    }

    private void fillArray() {
        int index = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < weights[i]; j++) {
                if (index >= array.length) {
                    break;
                }
                array[index++] = values[i];
            }
        }
    }

    public int getRandom() {
        fillArray();
        int randomIndex = (int) (Math.random() * array.length);
        return array[randomIndex];
    }
}
