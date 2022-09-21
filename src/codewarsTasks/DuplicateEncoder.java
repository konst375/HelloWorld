package codewarsTasks;

public class DuplicateEncoder {
    public static void main(String[] args) {
        System.out.println(encode("Success"));
    }

    static String encode(String word) {
        word = word.toLowerCase();
        StringBuilder result = new StringBuilder();
        int counter = 0;
        for (int i = 0; i < word.length(); i++) {
            char buffer = word.charAt(i);
            for (int j = 0; j < word.length(); j++) {
                if (buffer == word.charAt(j)) {
                    counter++;
                }
            }
            result.append(counter > 1 ? ")" : "(");
            counter = 0;
        }
        return result.toString();
    }

    static String encode1(String word){
        word = word.toLowerCase();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < word.length(); ++i) {
            char c = word.charAt(i);
            result.append(word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")");
        }
        return result.toString();
    }
}