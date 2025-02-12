package org.example;

public class Starpatt {
    public static void main(String[]args) {
        int lines = 8;
        int spacecount = lines-1;
        int starcount = 1;
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < spacecount; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < starcount; k++) {
                System.out.print("*");

            }
            spacecount--;
            starcount += 2;
            System.out.println();
        }
    }
}

