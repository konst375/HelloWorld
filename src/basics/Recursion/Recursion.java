package basics.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Recursion {
    private List<Integer> numericResult;
    private String inputString;
    private String stringResult = "";

    public Recursion() {
        numericResult = new ArrayList<>();
    }

    public Recursion(String inputString) {
        this.inputString = inputString;
    }

    public String getStringResult() {
        return stringResult;
    }

    public List<Integer> getNumericResult() {
        return numericResult;
    }

    /**
     * Used for cleaning results of previous method usage
     */
    public void clean() {
        stringResult = "";
        numericResult = new ArrayList<>();
    }

    public int calculateFactorial(int value) {
        if (value == 1) {
            return 1;
        }
        return calculateFactorial(value - 1) * value;
    }

    /**
     * Creates a sequence from 1
     * @param to end of sequence
     */
    public void createSequence(int to) {
        if (to != 1) {
            createSequence(to - 1);
        }
        numericResult.add(to);
    }

    /**
     * Creates an ascending sequence if from < to
     * and a descending sequence if from > to
     * @param from start of sequence
     * @param to end of sequence
     */
    public void createSortedSequence(int from, int to) {
        if (from == to) {
            numericResult.add(to);
            return;
        }

        numericResult.add(from);
        if (from < to) {
            createSortedSequence(++from, to);
        }
        createSortedSequence(--from, to);
    }

    /**
     * Creates a reversed substring
     * @param index reverse from
     */
    public void reverseStringV1(int index) {
        if (index != inputString.length() - 1) {
            reverseStringV1(index + 1);
        }
        stringResult += inputString.charAt(index);
    }

    /**
     * Creates a new string that consists of input string before index and reversed from index substring
     * @param index reverse from
     */
    public void reverseStringV2(int index) {
        StringBuilder stringBuilder = new StringBuilder(inputString.substring(index));
        stringResult += inputString.substring(0, index) + stringBuilder.reverse();
    }

    public int sumOfDigits(int sum) {
        if (sum < 10) {
            return sum;
        }
        return sum % 10 + sumOfDigits(sum / 10);
    }
}
