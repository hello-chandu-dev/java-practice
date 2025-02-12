package org.example;

public class Patter3 {
    public static void main (String [] args){
        int lines=6;
        int starcount=1;
        for (int i = 0; i <lines ; i++) {
            for (int j = 0; j <starcount ; j++) {
                System.out.print("*");

            }
            starcount+=2;
            System.out.println();

        }
    }
}
