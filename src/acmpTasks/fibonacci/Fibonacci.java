package acmpTasks.fibonacci;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new FileReader("src\\acmpTasks\\fibonacci\\input.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src\\acmpTasks\\fibonacci\\output.txt"))) {
            bufferedWriter.write(String.valueOf(fibonacci(scanner.nextInt())));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
