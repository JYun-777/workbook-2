package com.pluralsight;

import java.util.Scanner;

public class Prompter {

    public static long enterLong(Scanner _read, String prompt){
        System.out.print(prompt);
        long num = _read.nextLong();
        _read.nextLine();
        return num;
    }

    public static String enterInfo(Scanner _read, String prompt){
        System.out.print(prompt);
        String info = _read.nextLine();
        return info;
    }
}
