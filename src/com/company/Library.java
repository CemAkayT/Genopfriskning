package com.company;

import java.util.ArrayList;

public class Library{

    public boolean containsISBN(Bog bog){
        return bog.getISBN() == 12345;
    }

    public static void main(String[] args) {

    ArrayList<Bog> books = new ArrayList<>();

    books.add(new Bog(1234,2019,"Corona"));
    books.add(new Bog(1235,2001,"9/11"));
    books.add(new Bog(1236,1986,"WC in Mexico"));
       for (Bog b : books){
           System.out.println(b);
       }

    }

}
