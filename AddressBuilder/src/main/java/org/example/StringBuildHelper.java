package org.example;

import java.util.Scanner;

public class StringBuildHelper {
    public static void append(Scanner _read, String _prompt, StringBuilder _buildString){
        System.out.print(_prompt);
        String appendContent = _read.nextLine();
        _buildString.append(appendContent);
    }
}
