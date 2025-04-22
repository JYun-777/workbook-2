package org.example;

import java.util.List;
import java.util.Scanner;

public class Book {

    public static Scanner read = new Scanner(System.in);

    //Author, title, pagecount, genre, ISBN

    private String author;
    private String title;
    private int pageCount;
    private String genre;
    private String ISBN;
    private long publishYear;

    private boolean isCheckedOut;
    private String checkedOutTo;

    public void checkOut(String checkOuter){
        this.isCheckedOut = true;
        this.checkedOutTo = checkOuter;
    }

    public void checkIn(){
        if (isCheckedOut){
            this.isCheckedOut = false;
            this.checkedOutTo = "";
        }else{
            System.out.println("Book is not checked out");
        }
    }

    //Create a constructor with title and author and isbn

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isCheckedOut = false;
        this.checkedOutTo = "";
    }

    public void displayBookDetails(){
        System.out.printf("%s by %s\nGenre: %s\nPage Count: %d\nISBN: %s\nPublished: %d\n~~~~~~~~~~~~~~~~~~~~~~~~\n",
                this.title, this.author, this.genre, this.pageCount, this.ISBN, this.publishYear);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        if (pageCount <= 0) {
            throw new IllegalArgumentException("Page count must be greater than 0.");
        }
        this.pageCount = pageCount;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public long getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(long publishYear) {
        this.publishYear = publishYear;
    }

    public boolean getIsCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }
}
