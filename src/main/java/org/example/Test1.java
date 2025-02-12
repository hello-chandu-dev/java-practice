package org.example;

public class Test1 {
    public static void main(String[] args) {


        // if num is a multiple of 15 - COCO COLA
        // if num is a multiple of 5 - COLA
        // if num is a multiple of 3 - COCO
//    int num = 3;

        for (int num =1; num<=30; num++) {

            if(num==0 )
                continue;

            if (num % 15 == 0) {
                System.out.println(num+": Cocacola");
            }

            else if (num % 5 == 0) {
                System.out.println(num+": cola");
            }
            else if (num % 3 == 0) {
                System.out.println(num+": coco");
            }

        }
    }


}

