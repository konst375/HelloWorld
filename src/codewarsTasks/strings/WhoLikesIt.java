package codewarsTasks.strings;

public class WhoLikesIt {
    public static void main(String[] args) {
        System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max", "Alex", "Jacob", "Mark", "Max"));
    }

    public static String whoLikesIt(String... names) {
        String result;
        switch (names.length) {
            case 0 -> result = "no one likes this";
            case 1 -> result = names[0] + " likes this";
            case 2 -> result = names[0] + " and " + names[1] + " like this";
            case 3 -> result = names[0] + ", " + names[1] + " and " + names[2] + " like this";
            default -> result = names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
        }
        return result;
    }
}
