package org.example.practice;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First value for Multiplication");
        int a= sc.nextInt();
        System.out.println("Enter the Second value for Multiplication");
        int b=sc.nextInt();
        System.out.println("Multiply with :"+a*b+"  this  is the answer");
    }
}
