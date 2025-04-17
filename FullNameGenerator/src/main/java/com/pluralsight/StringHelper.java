package com.pluralsight;

public class StringHelper {
    public static String grabFirstWord(String input) {
        int spaceIndex = input.indexOf(' ');
        if (spaceIndex == -1) return input;
        return input.substring(0, spaceIndex);
    }


    public static String grabLastWord(String input) {
        int lastSpaceIndex = input.lastIndexOf(' ');
        if (lastSpaceIndex == -1) return input;
        return input.substring(lastSpaceIndex, input.length());
    }
}

