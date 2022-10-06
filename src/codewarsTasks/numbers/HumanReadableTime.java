package codewarsTasks.numbers;

public class HumanReadableTime {
    public static void main(String[] args) {
        System.out.println(makeReadable(30));
    }

    public static String makeReadable(int seconds) {
        int totalHours = seconds / 3600;
        seconds -= totalHours * 3600;
        int totalMinutes = seconds / 60;
        seconds -= totalMinutes * 60;
        return (totalHours < 10 ? "0" : "") + totalHours
                + ":" + (totalMinutes < 10 ? "0" : "") + totalMinutes
                + ":" + (seconds < 10 ? "0" : "") + seconds;
    }
}
