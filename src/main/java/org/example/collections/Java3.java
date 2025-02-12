package org.example.collections;

import java.util.ArrayList;

public class Java3 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("rani");
        list.add("raju");
        list.add("ramana");
        list.add("raghu");
        list.add("ratnam");

        String [] ar1=new String[list.size()];

        ar1=list.toArray(ar1);
        System.out.println(ar1[0]);
        System.out.println(ar1[1]);
        System.out.println(ar1[4]);
        System.out.println(ar1[2]);
        System.out.println(ar1[3]);

    }
}
