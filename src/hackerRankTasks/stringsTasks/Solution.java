package hackerRankTasks.stringsTasks;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String nextStr = sc.next();
            if (nextStr.equals("."))
                break;
            System.out.println(firstCondition(nextStr) && secondCondition(nextStr));
        }
    }

    public static boolean firstCondition(String input) {
        int openR = 0;
        int closeR = 0;
        int openS = 0;
        int closeS = 0;
        int openC = 0;
        int closeC = 0;

        for (int i = 0; i < input.length(); i++) {
            char s = input.charAt(i);
            switch (s) {
                case '(' -> openR++;
                case ')' -> closeR++;
                case '[' -> openS++;
                case ']' -> closeS++;
                case '{' -> openC++;
                case '}' -> closeC++;
            }
        }
        return openR == closeR && openS == closeS && openC == closeC;
    }

    public static boolean secondCondition(String input) {
        int openR = Math.max(input.indexOf('('), 0);
        int closeR = Math.max(input.indexOf(')'), 1);
        int openS = Math.max(input.indexOf('['), 0);
        int closeS = Math.max(input.indexOf(']'), 1);
        int openC = Math.max(input.indexOf('{'), 0);
        int closeC = Math.max(input.indexOf('}'), 1);
        return openR < closeR && openS < closeS && openC < closeC;
    }
}
