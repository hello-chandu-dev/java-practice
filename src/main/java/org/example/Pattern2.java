package org.example;

public class Pattern2 {

    // *****
    // ****
    // ***
    // **
    // *
    public static void main(String[] args) {
       int lines = 7;
       int strCount = lines;
       for(int i =0; i<lines;i++){
            for(int j=0;j<strCount;j++){
               System.out.print("*");            }
           strCount--;
           System.out.println();
        }

       for(int i =0; i<lines;i++){
           for(int j=0;j<strCount;j++){
        System.out.print("*");
           }
           strCount-=2;
           System.out.println();
        }
    }
}
