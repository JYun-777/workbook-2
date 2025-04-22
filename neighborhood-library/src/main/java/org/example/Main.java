package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    //Create an arraylist of bookx
    public static List<Book> books = new ArrayList<>();
    public static Scanner read = new Scanner(System.in);


    public static void main(String[] args) throws InterruptedException {

        fillLibrary();

        mainMenu();
    }

    public static void mainMenu() throws InterruptedException {
        while (true) {
            System.out.println("Welcome to the library!\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            Thread.sleep(1000);

            System.out.println("Please choose an option:\n\n 1. Show available books\n 2. Show Checked Out Books\n 3. Exit");
            System.out.print(">>");
            int menuOption = read.nextInt();
            read.nextLine();

            switch (menuOption) {
                case 1:
                    showAvailable();
                    break;
                case 2:
                    showCheckedOut();
                    break;
                case 3:
                    System.out.println("Have a good day!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.\n");
                    Thread.sleep(1000);
                    break;
            }

        }
    }

    public static void showAvailable() throws InterruptedException {
        System.out.println("Books Available For Checkout\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

        for (Book book : books){
            book.displayBookDetails();
        }

        System.out.println("Enter C to select a book to check out, or X to return to main menu.");
        String menuOption = read.nextLine();
        switch (menuOption) {
            case "C":
                System.out.println("Please enter the name of the book you would like to check out.");
                System.out.print(">>");
                String bookSelection = read.nextLine();
                for (Book book : books) {
                    if (bookSelection.equals(book.getTitle())) {
                        System.out.print("\nPlease enter your name.\n>>");
                        String userName = read.nextLine();
                        book.checkOut(userName);
                        System.out.printf("%s successfully checked out to %s.\n", book.getTitle(), userName);
                        Thread.sleep(1000);

                    }
                }
                break;
            case "X":
                System.out.println("Returning to menu...\n");
                Thread.sleep(1000);
                break;
            default:
                System.out.println("Invalid Option. Please try again.\n");
                Thread.sleep(1000);
                showAvailable();
                break;
        }

    }

    public static void showCheckedOut() throws InterruptedException {
        System.out.println("\nBooks Currently Checked Out\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");


        for(Book book: books){
            if (book.getIsCheckedOut()){
                book.displayBookDetails();
            }
        }

        System.out.print("Enter C to check in a book, or X to return to main menu.\n>>");
        String menuOption = read.nextLine();
        switch (menuOption) {
            case "C":
                System.out.println("Please enter the name of the book you would like to check in.");
                System.out.print(">>");
                String bookSelection = read.nextLine();
                for (Book book : books) {
                    if (bookSelection.equals(book.getTitle())) {
                        if (book.getIsCheckedOut()){
                            book.checkIn();
                        }else{
                            System.out.println("Book is not checked out.");
                        }
                    }
                }
                break;
            case "X":
                System.out.println("Returning to menu...\n");
                Thread.sleep(1000);
                break;
            default:
                System.out.println("Invalid Option. Please try again.\n");
                Thread.sleep(1000);
                showCheckedOut();
                break;

        }
    }
    public static void fillLibrary(){
        //Create book objects
        Book book1 = new Book("The Three-Body Problem", "Cixin Liu", "9780765382030");
        Book book2 = new Book("Atomic Habits", "James Clear", "9780735211292");
        Book book3 = new Book("Fahrenheit 451", "Ray Bradbury", "9781451673319");
        Book book4 = new Book("1984", "George Orwell", "9780451524935");
        Book book5 = new Book("Things Fall Apart", "Chinua Achebe", "9780385474542");
        Book book6 = new Book("Mushoku Tensei: Jobless Reincarnation Vol. 1", "Rifujin na Magonote", "9781642751383");
        Book book7 = new Book("Artemis Fowl", "Eoin Colfer", "9781368036986");
        Book book8 = new Book("Unbroken", "Laura Hillenbrand", "9780812974492");
        Book book9 = new Book("Prisoner B-3087", "Alan Gratz", "9780545459013");
        Book book10 = new Book("The Heroin Diaries", "Nikki Sixx", "9781501187544");
        Book book11 = new Book("90 Rules for Entrepreneurs", "Marnus Broodryk", "9780620758352");
        Book book12 = new Book("The 48 Laws of Power", "Robert Greene", "9780140280197");
        Book book13 = new Book("Ender's Game", "Orson Scott Card", "9780812550702");
        Book book14 = new Book("The Prince", "Niccolò Machiavelli", "9781668506448");
        Book book15 = new Book("Disruptive Thinking", "T.D. Jakes", "9781546004004");

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);
        books.add(book8);
        books.add(book9);
        books.add(book10);
        books.add(book11);
        books.add(book12);
        books.add(book13);
        books.add(book14);
        books.add(book15);
    }
}