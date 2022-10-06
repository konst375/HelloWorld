package codewarsTasks.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringSplit {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("abcdefj")));
    }

    public static String[] solution(String s) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i += 2) {
            if (i + 1 != s.length()) {
                result.add(s.substring(i, i + 2));
            } else {
                result.add(s.charAt(i) + "_");
            }
        }
        return result.toArray(new String[0]);
    }
}
