package org.example.practice;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your first number");
        int a = sc.nextInt();
        System.out.println("enter your second number");
        int b = sc.nextInt();
        System.out.println("sum of num1: "+a +"and num2: "+b+ " is : "+(a+b));
    }
}
