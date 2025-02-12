package org.example.oops.methodoverloading;

public class Pattern {
    public static void main(String[] args) {
        /*int lines = 7;
        int starCount = 1;
        int spaceCount = lines - 1;
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < spaceCount; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < starCount; k++) {
                System.out.print("*");
            }
//Starcount increased &space count reduced
            starCount +=2;
            spaceCount--;
            // System.out.println();
//  *
//  **
// ****
//  **
//   *

            // we have taken half the line
           /* if (i < lines / 2) {
                spaceCount--;
                starCount+=2;

            }
            // againg we reduced the count of stars
           else{
               spaceCount++;
               starCount-=2;

            }
            System.out.println();

        }*/
        //*
        //***
        //*****
        /*int lines=6;
        int starcount=1;
        for (int i = 0; i <lines ; i++) {
            for (int j = 0; j <starcount ; j++) {
                System.out.print("*");

            }
            starcount+=2;
            System.out.println();

        }*/
        //*****
        //***
        //**
        //*

/*
        int lines=7;
        int starCount=lines;
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < starCount; j++) {
                System.out.print("*");
            }
                starCount--;
                System.out.println();

        }
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < starCount; j++) {
                System.out.println("*");
            }
                starCount-=2;
                System.out.println();

            }*/
        int num=11;
        boolean isaprimenumber=true;
        //if a number is not divisible by any num between to 2 and num/2 it means not a prime number
        for (int i = 2; i <num/2 ; i++) {
            if (num % i == 0) {
                isaprimenumber = false;
              break;
            }
        }
            if(isaprimenumber){
                System.out.println("is a prime number");

            }
            else {
                System.out.println("is not prime number");
            }
       }
    }



