package org.example;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of lines you want in the pattern");
//        int lines = sc.nextInt();
        int lines = 9;
        int spacecount = lines-1;
        int starcount = 1;
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < spacecount; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < starcount; k++) {
                System.out.print("*");
            }
//            spacecount--;
//            starcount += 2;
            if (i < lines/2) {
                spacecount--;
                starcount += 2;
            } else {
                spacecount++;
                starcount -= 2;

            }
            System.out.println();
        }

    }
}
