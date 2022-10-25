package codewarsTasks.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Scramblies {
    public static void main(String[] args) {
        System.out.println(scramble("katas", "steak"));
    }

    public static boolean scramble(String str1, String str2) {
        if (!Arrays.stream(str2.split("")).allMatch(str1::contains))
            return false;
        Map<String, Integer> str1Map = new HashMap<>();
        Map<String, Integer> str2Map = new HashMap<>();
        Arrays.stream(str1.split("")).forEach(s -> str1Map.put(s, str1Map.containsKey(s) ? str1Map.get(s) + 1 : 1));
        Arrays.stream(str2.split("")).forEach(s -> str2Map.put(s, str2Map.containsKey(s) ? str2Map.get(s) + 1 : 1));
        for (String key : str2Map.keySet()) {
            if (str1Map.get(key) < str2Map.get(key))
                return false;
        }
        return true;
    }
}
