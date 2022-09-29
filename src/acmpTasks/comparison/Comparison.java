package acmpTasks.comparison;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new FileReader("src\\acmpTasks\\comparison\\input.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src\\acmpTasks\\comparison\\output.txt"))
        ) {
            int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (array[0] > array[1]) {
                bufferedWriter.write(">");
            } else if (array[0] < array[1]) {
                bufferedWriter.write("<");
            } else {
                bufferedWriter.write("=");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
