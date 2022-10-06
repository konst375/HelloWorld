package codewarsTasks.arrays;

import java.util.*;

public class DirReduction {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(dirReduction(new String[]{"EAST", "EAST", "WEST", "NORTH", "WEST", "EAST", "EAST", "SOUTH", "NORTH", "WEST"})));
    }

    public static String[] dirReduction(String[] arr) {
        int x = 0;
        int y = 0;

        for (String currentReduction : arr) {
            switch (currentReduction) {
                case "NORTH" -> x++;
                case "SOUTH" -> x--;
                case "WEST" -> y++;
                case "EAST" -> y--;
            }
        }
        String[] result = new String[Math.abs(x) + Math.abs(y)];
        for (int i = 0; i < result.length; i++) {
            for (String currentReduction : arr) {
                switch (currentReduction) {
                    case "NORTH" -> {
                        if (x > 0) {
                            result[i] = "NORTH";
                            x--;
                        }
                    }
                    case "SOUTH" -> {
                        if (x < 0) {
                            result[i] = "SOUTH";
                            x++;
                        }
                    }
                    case "WEST" -> {
                        if (y > 0) {
                            result[i] = "WEST";
                            y++;
                        }
                    }
                    case "EAST" -> {
                        if (y < 0) {
                            result[i] = "EAST";
                            y--;
                        }
                    }
                }
            }
        }
        return result;
    }
}