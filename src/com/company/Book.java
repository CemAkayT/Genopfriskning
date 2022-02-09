package com.company;

public class Book {
    private int ISBN, yearOfRelease;
    private String title;

    public Book(int ISBN, int yearOfRelease, String title) {
        this.ISBN = ISBN;
        this.yearOfRelease = yearOfRelease;
        this.title = title;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book: " + title + ", " + yearOfRelease + ", " + ISBN;
    }

}
