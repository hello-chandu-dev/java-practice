package org.example;

public class StarPattern {

    //   *
    //  ***
    // ******
    //********
    public static void main(String[] args) {
//        String star="*";
        System.out.println("Hello..");
        int lines = 19;
        int spaceCount = lines-1;
        int starCount = 1;
        for(int i=0; i< lines;i++){

            for(int j =0 ; j< spaceCount; j++){
                System.out.print(" ");
            }
            for(int k=0;k<starCount; k++){
                System.out.print("*");
            }
            spaceCount--;
            starCount+=2;
//            if(i < lines/2 ){
//                spaceCount--;
//                starCount+=2;
//            }
//            else{
//                spaceCount++;
//                starCount-=2;
//            }

            System.out.println();
        }
    }
}
