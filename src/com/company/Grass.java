package com.company;

import java.util.Scanner;

public class Grass {
    private int numOfDays;
    private double lenghtNow, maxLenght;

    public int daysRemaining(double lenghtNow, double maxLength) {
        while (lenghtNow <= maxLength - 0.8) {
            lenghtNow += 0.8;
            numOfDays++;
        }
        return numOfDays;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grass grass = new Grass();

        System.out.println("How long is the grass now? ");
        grass.lenghtNow = scanner.nextDouble();

        System.out.println("what is maximum length before machine should start? ");
        grass.maxLenght = scanner.nextDouble();

        System.out.println(grass.daysRemaining(grass.lenghtNow,grass.maxLenght) + " days before machine starts.");

    }
}
