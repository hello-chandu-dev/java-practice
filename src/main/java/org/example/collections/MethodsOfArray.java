package org.example.collections;

public class MethodsOfArray {
    public static void main(String[] args) {
//            String [] array=new String[4];
//            array[0]="raju";
//        array[1]="mani";
//        array[2]="rani";
//        array[3]="mamatha";
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
        //Method 2
//        String [] array={"rani","kavitha","potti"};
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
        //Method3

        int [] []array1={{1,4,7,9},{5,6,3,2}};
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(array1[i][j]);

            }

        }

    }
}
