package org.example.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Java4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("rani");
        list.add("raju");
        list.add("ramana");
        list.add("raghu");
        list.add("ratnam");

        for (int i = 0; i < 1; i++) {
            System.out.println(list);

        }

        for (String lists : list) {
            System.out.println(lists);

        }
//        Iterator<String> it = list.iterator();
//        while (it.hasNext());{
//            System.out.println(it.next());
//       }
//
        list.stream().forEach(
                (temp) -> System.out.println(temp));

    }
}
