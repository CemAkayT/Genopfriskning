package com.company;

public class Kvadrat {

    public void drawSquare(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Kvadrat kvadrat = new Kvadrat();
        kvadrat.drawSquare(6);

    }
}
