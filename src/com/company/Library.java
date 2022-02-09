package com.company;

import java.util.ArrayList;

public class Library{
    private ArrayList<Book> bookList = new ArrayList<>();


    public void addBookToShelf(Book book){
        bookList.add(book);
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public boolean containsISBN(Book book){

        for (Book currentBook : bookList) { // tjekker for hver indexplads på hylden om bogen på hylden er lig med bog som ikke er på hylden
            if (currentBook.getISBN() == book.getISBN()) {
                return true;
            }
        }
        return false;
    }
}
