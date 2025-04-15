package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String firstName;
        String lastName;
        String middleName;
        String suffix;

        System.out.println("Enter first name: ");
        firstName = read.nextLine();
        firstName.trim();

        System.out.print("Enter last name: ");
        lastName = read.nextLine();
        lastName.trim();

        System.out.print("Enter middle name (press enter if not applicable): ");
        middleName = read.nextLine();
        middleName.trim();

        System.out.print("Enter suffix (press enter if not applicable): ");
        suffix = read.nextLine();
        suffix.trim();

        String fullName;
        fullName = firstName + " ";
        if (!middleName.isEmpty()) fullName += middleName + " ";
        fullName += lastName + " ";
        if(!suffix.isEmpty()) fullName += ", " + suffix;

        System.out.println("Full Name: " + fullName);
    }
}