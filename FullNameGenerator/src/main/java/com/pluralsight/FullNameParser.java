package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {

    public static Scanner read = new Scanner(System.in);

    public static void main(String[] args){
        String fullName;

        System.out.println("Enter your name in one of these formats: \n - First Name, Last Name \n - First Name, Middle Name, Last Name \n\n >>>");
        fullName = read.nextLine();

        String[] names;
        names = fullName.split(" ");

        String firstName = "(none)";
        String middleName = "(none)";
        String lastName = "(none)";
        if (names.length == 3){
            firstName = names[0];
            middleName = names[1];
            lastName = names[2];
        } else if (names.length == 2){
            firstName = names[0];
            middleName = "(none)";
            lastName = names[1];
        }

        System.out.println(StringHelper.grabFirstWord(fullName));
        System.out.println(StringHelper.grabLastWord(fullName));

        System.out.printf("First Name: %s\nMiddle Name: %s\nLast Name: %s", firstName, middleName, lastName);

    }
}
