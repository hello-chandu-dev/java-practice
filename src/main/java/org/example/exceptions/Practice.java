package org.example.exceptions;

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Practice {
    public static void main(String[] args) {
        // Run-Time Exceptions
//        int a = 50;
//        int b = 0;
//        try {
//            int output = a / b;
//
//        } catch (ArithmeticException e) {
//           // System.out.println(a/(b+a));
//
//           // System.out.println(b/a);
//            System.out.println("program Successfully done");
//        }
//        System.out.println("Rest of the code");

//        int[] a={1,2,4,3,9};
//
//        try {
//            System.out.println(a[8]);
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("out of bound");
//
//        }
//        System.out.println("rest of the code");
//        System.out.println("remaining code will be execute");
//
//        FileReader fr=new FileReader("D:\\testout.txt");
//        System.out.println(fr);

//        int a = 23;
//        int b = 0;
//        try {
//            int output = a / b;
//
//
//        } catch (ArithmeticException N) {
//            System.out.println(" exception found");
//        } finally {
//            System.out.println("finally successfully");
//        }

        int a = 42;
        int b = 0;
        try {
            if (a == 1) a = a / (a - a);
            if (a == 2) b = a / (a - b);
            int c[] = {1};
            c[5] = 99;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out-of-bound: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Divide by 0: " + e);
        }

    }
}
