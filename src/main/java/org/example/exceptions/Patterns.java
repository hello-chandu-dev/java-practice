package org.example.exceptions;

public class Patterns {
    public static void main(String[] args) {
        int lines = 9;
        int starCount = 1;
        // i = 0 - 1
        // i = 1 - 3
        // i = 2 - 5
        for (int i = 0; i < lines; i++) {
            for (int k = 0; k < starCount; k++) {
                System.out.print("*");
            }
            starCount += 2;
            System.out.println();
        }
    }
}