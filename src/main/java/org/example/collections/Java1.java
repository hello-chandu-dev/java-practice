package org.example.collections;

import java.util.ArrayList;
import java.util.List;

public class Java1 {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("A");
        arr.add("B");
        arr.add("c");
        arr.add("Hyderbad");
       // arr.set(0,"c");

        boolean ans=arr.contains("A");
        if(ans){
            System.out.println("this list does have");
        }
else{
            System.out.println("this list does not have");
        }
ans=arr.contains("D");
        if(ans){
            System.out.println("this list does have");
        }
        else{
            System.out.println("this list does not have");
        }





//        System.out.println("Printing1");
//        for (String num: arr ) {
//            System.out.println(num);
//
//        }
//        List<String> arr1 = new ArrayList<>();
//        arr1.add("Abc");
//        arr1.add("Boy");
//        arr1.add("cat");
//        arr1.add("Hyderbad");
//        System.out.println("Printing2");
//        for (String number: arr1 ) {
//            System.out.println(number);
//
//        }
//        arr.addAll(arr1);
//        System.out.println("priniting all");
//        for (String number1:arr
//             ) {
//            System.out.println(number1);
//
//
//
//        }







//        System.out.println("before adding"+ arr);
//
//        arr.add(4,"mahima,rangoli,raju,banti");
//        System.out.println("afteraddingall"+arr);



    }
}
