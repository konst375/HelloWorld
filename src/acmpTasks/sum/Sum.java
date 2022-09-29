package acmpTasks.sum;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        int sum = 0;
        try (Scanner scanner = new Scanner(new File("src\\acmpTasks\\sum\\input.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src\\acmpTasks\\sum\\output.txt"))) {
//            for (String number : scanner.nextLine().split(" ")) {
//                sum += Integer.parseInt(number);
//            }
//            bufferedWriter.write(Integer.toString(sum));
            bufferedWriter.write(
                    Long.toString(
                            Arrays.stream(scanner.nextLine().split(" "))
                                    .mapToLong(Long::parseLong)
                                    .sum()
                    )
            );
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
