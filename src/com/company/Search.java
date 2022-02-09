package com.company;

public class Search {

    public int returnIndexPosition(String[] s, String str) {
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Search search = new Search();

        String[] s = new String[] {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        System.out.println(search.returnIndexPosition(s,"Z"));
    }
}
