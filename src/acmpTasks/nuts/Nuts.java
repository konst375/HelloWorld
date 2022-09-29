package acmpTasks.nuts;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Nuts {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new FileReader("src\\acmpTasks\\nuts\\input.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src\\acmpTasks\\nuts\\output.txt"))
        ) {
            int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            bufferedWriter.write((array[0] * array[1] >= array[2]) ? "yes" : "no");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
