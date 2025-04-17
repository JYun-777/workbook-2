package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        String[] names;
        String dateInput;
        LocalDate date;
        int tickets;

        Scanner read = new Scanner(System.in);

        System.out.print("Please enter your name (FirstName LastName): ");
        name = read.nextLine();

        names = name.split(" ");


        System.out.print("Which date will you be coming? (MM/DD/YYYY): ");
        dateInput = read.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        date = LocalDate.parse(dateInput, formatter);

        System.out.print("How many tickets are you purchasing?: ");
        tickets = read.nextInt();


        System.out.printf("%d ticket%s reserved for %s under %s, %s", tickets, (tickets == 1 ? "" : "s"), date, names[1], names[0]);

    }
}