package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sorting {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> strings = new ArrayList<>();

    public ArrayList<String> readString() {
        strings.clear();
        for (int i = 0; i < 5; i++) {
            strings.add(scanner.next());
        }
            Collections.sort(strings);
            Collections.reverse(strings);
        return strings;
    }

    public static void main(String[] args) {
        Sorting sorting = new Sorting();
        ArrayList<String> strings = sorting.readString();

        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }
}

