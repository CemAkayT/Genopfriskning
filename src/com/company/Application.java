
package com.company;

public class Application {

    public static void main(String[] args) {
        Book book = new Book(1238, 1900, "abc");
        Library library = new Library();

        library.addBookToShelf(new Book(1239,2019,"Corona"));
        library.addBookToShelf(new Book(1235,2001,"9/11"));
        library.addBookToShelf(new Book(1236,1986,"WC in Mexico"));

        for (Book b : library.getBookList()){
            System.out.println(b);
        }
        System.out.println(library.containsISBN(book));
    }

}

