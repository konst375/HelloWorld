package acmpTasks.arrivalTime;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ArrivalTime {
    public static final int MAX_HOURS = 24;
    public static final int MAX_MINUTES = 60;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new FileReader("src\\acmpTasks\\arrivalTime\\input.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src\\acmpTasks\\arrivalTime\\output.txt"))) {

            int[] departureTime = Arrays.stream(scanner.nextLine().split(":"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int[] travelTime = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int hours = departureTime[0] + travelTime[0];
            int minutes = departureTime[1] + travelTime[1];

            hours = (hours < MAX_HOURS) ? hours : hours - MAX_HOURS;
            minutes = (minutes < MAX_MINUTES) ? minutes : minutes - MAX_MINUTES;

            bufferedWriter.write(String.format("%02d:%02d", hours, minutes));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
