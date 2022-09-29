package acmpTasks.notDeafPhone;


import java.io.*;

public class NodDeafPhone {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\acmpTasks\\notDeafPhone\\input.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter (new FileWriter("src\\acmpTasks\\notDeafPhone\\output.txt"))) {
            bufferedWriter.write(bufferedReader.readLine());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
