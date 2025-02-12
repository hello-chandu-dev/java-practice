package org.example.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerClassTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        List<Integer> numbersList = new ArrayList<>();
//        while(sc.hasNextInt()){
//            int num = sc.nextInt();
//            numbersList.add(num);
//        }
//        System.out.println(numbersList);
//        List<String> stringList = new ArrayList<>();
//        while (sc.hasNext()){
//            String next = sc.next();
//            stringList.add(next);
//        }
//        System.out.println(stringList);
        // sc.hasNext(".*ab") - starting with anything but ending should be with the letter/pattern specified. eg., cab
        // sc.hasNext("ab.*") - starting with ab, but it can end with anything eg., abcd
        // sc.hasNext(".*ab.*") - it will just check if the input contains ab in it - eg., sasab223
//        while (sc.hasNext(".*a")){
//            String input = sc.next();
//            stringList.add(input);
//        }
//        System.out.println(stringList);
//        System.out.println("reading first word");
//        String firstWord = sc.next();
//        System.out.println("reading second word");
//        String secondWord = sc.next();
//        String thirdword = sc.next();
//        System.out.println("first word is : "+firstWord);
//        System.out.println("second word is : "+secondWord);
//        System.out.println("third word is : "+thirdword);
//        System.out.println("pls type your sentence : ");
//        String sentence = sc.nextLine();
//        String sentence2 = sc.nextLine();
//        System.out.println(sentence);
//        System.out.println(sentence2);
        System.out.println("enter your name");
        String next = sc.next();
        System.out.println("enter your age");
//        sc.nextLine();
        String nextLine = sc.nextLine();
        System.out.println("your name is : "+next);
        System.out.println("your age is : "+nextLine);
        sc.close();




    }
}

