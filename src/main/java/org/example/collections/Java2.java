package org.example.collections;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java2 {
    public static void main(String[] args) {
        String []names={"raju","rani","mahendra","sweety"};
        List list=Arrays.asList(names);
        ArrayList alist=new ArrayList<>(list);
        System.out.println(alist);
        alist.add("raghu");
        alist.add("ramu");
        System.out.println(alist);
       // alist.addAll(4,null);
        //System.out.println("alist");


    }
}
