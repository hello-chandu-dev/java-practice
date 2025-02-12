package org.example.oops.access.Strings;

import java.util.Scanner;
import java.util.Arrays;

public class Practice1 {
//    public static void main(String[] args) {
//        String s = "chandana";
//        String s1 = "reddy";
//
//        String result = s + s1;
//        System.out.println(result);
//
//        String upper = result.toUpperCase();
//        System.out.println(upper);
//        String lower = result.toLowerCase();
//        System.out.println(lower);
//        int a = result.length();
//        System.out.println(a);
//
//        char[] b = result.toCharArray();
//        System.out.println(b);
//
//        System.out.println(result.hashCode());
//        System.out.println(s.hashCode());
//        System.out.println(s.compareTo(s1));
//
//        String name = "chandana";
//        String nam = "CHANDANA";
//        System.out.println(name.equalsIgnoreCase(nam));
//
//        if (name == name)
//        {
//            System.out.println("equal");
//        }
//        else{
//            System.out.println("not equal");
//        }
//        System.out.println(s.split("n"));
//
//        Scanner names=new Scanner(System.in);
//        System.out.println("enter your name: ");
//
//        String st="k chandana";
//        String st1="k praveen kumar";
//        String st2="cklakshmi";
//        String st3="ckmahendra";
//
//        System.out.println(st.startsWith("k"));
//        System.out.println(result.substring(0,8));

    public static void main(String[] args) {
       // String s1="thisisindexvalue";
        //int index=s1.indexOf("is",2);
       // System.out.println(index);

//        char value=s1.charAt(4);
//        System.out.println(value);

//        String name="javapoint";
//        System.out.println(name.substring(2,4));
//        System.out.println(name.substring(2));
//        System.out.println(name.contains("point"));
//        String name=String.join("   ","welcome","to","Hyderabad");
//        System.out.println(name);

//

        //String str="java is a point of access";
//        String[] words=str.split("a",15);
//        for(String w:words){
//            System.out.println(w);
//        }

//        String s1="this is indexof medthod";
//        int index=s1.indexOf('d');
//        System.out.println(index);

        StringBuilder s=new StringBuilder("hello");
        s.append("world");
        System.out.println(s);
        s.insert(1,"java");
        System.out.println(s);
        s.replace(0,1,"hai");
        System.out.println(s);
        s.delete(7,11);
        System.out.println(s);
        s.reverse();
        System.out.println(s);
        System.out.println(s.capacity());

        System.out.println(s.charAt(2));




    }




    }




