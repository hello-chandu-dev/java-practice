package org.example.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
//        String []  strArr = new String[2];
//        strArr[0]="aaa";
//        strArr[1]="sss";
//        strArr[2]="xxx";
        List<String> namesList = new ArrayList<>(4);
        namesList.add("praveen");
        namesList.add("Chandu");
        namesList.add("abc");
        namesList.add("xyz");
        namesList.add("ppp");
        System.out.println(namesList.size());
        System.out.println(namesList.remove("abc"));
        System.out.println(namesList);
    }
}
