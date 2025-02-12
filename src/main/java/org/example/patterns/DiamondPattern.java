package org.example.patterns;

public class DiamondPattern {
    public static void main(String[] args) {
        // *
        //***
        // *
        int lines=5;
        int starCount=1;
        int spaceCount=lines/2;
        for (int i=0;i<lines;i++){
            for (int j = 0; j < spaceCount; j++) {
                System.out.print(" ");
            }

            for (int K = 0; K < starCount; K++) {
                System.out.print("*");
            }

            if(i<lines/2){
                starCount+=2;
                spaceCount--;
            }
            else {
                starCount-=2;
                spaceCount+=1;
            }
            System.out.println();
        }
    }
}
