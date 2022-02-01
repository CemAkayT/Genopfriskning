package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sortering {

    public void readString() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            ArrayList<String> strings = new ArrayList<>();
            strings.add(scanner.next());
        }
    }

    public static void main(String[] args) {
        Sortering sort = new Sortering();

    }

}
