package codewarsTasks;

public class PangramChecker {
    public static void main(String[] args) {
        System.out.println(check1("The quick brown fox jumps over the lazy dog."));
    }

    public static boolean check(String sentence) {
        return sentence.toLowerCase()
                .replaceAll("[^a-z]", "")
                .replaceAll("(.)(?=.*\\1)", "")
                .length() == 26;
    }

    public static boolean check1(String sentence) {
        return sentence.toLowerCase()
                .chars()
                .filter(ch -> ch >= 'a' && ch <= 'z')
                .distinct()
                .count() == 26;
    }
}
