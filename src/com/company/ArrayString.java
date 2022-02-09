package com.company;

import java.util.ArrayList;

public class ArrayString {

    public boolean doesArrayListContainString(ArrayList<String> arrayList, String str){
        if (arrayList.contains(str)){
            return true;
        }else
        arrayList.add(str);
            return false;
    }

    public static void main(String[] args) {
       ArrayString arrayString = new ArrayString();

       ArrayList<String> strings = new ArrayList<>();
       strings.add("cem");
       strings.add("akay");
       strings.add("turker");
        System.out.println(strings);

        System.out.println(arrayString.doesArrayListContainString(strings,"hasibe"));
       System.out.println(strings);

        System.out.println(arrayString.doesArrayListContainString(strings,"hasibe"));
        System.out.println(strings);

        System.out.println(arrayString.doesArrayListContainString(strings,"faik"));
        System.out.println(strings);
    }
}
