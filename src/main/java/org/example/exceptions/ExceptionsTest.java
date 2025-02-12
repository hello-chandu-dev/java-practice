package org.example.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsTest {
    public static void main(String [] args) {
        // unexpected state  - during the execution of a program
      //  System.out.println("Hello world!!");
       // System.out.println(2*7);
//        System.out.println(1/0);
//        System.out.println("Program last line");


//        String str = null;
//        boolean output = false;
//        if(str != null)
//            output = str.equals("abc");
//        System.out.println(output);

//        String [] array = {"a", "saf"};
//        System.out.println(array[2]);

        // System exceptions
        // user defined exceptions
//        FileReader file = new FileReader("file.txt");
//        file.getName();

        // different ways to handle exceptions:
        // throws - keyword
        // try-catch

//        String fileName=null;
//        // below readFile() method is handling compile time exception using throws keyword
//        try{
//            System.out.println(fileName.equals("abc"));
//            readFile(fileName);
//        }
//        catch(FileNotFoundException fe){
////            fe.printStackTrace();
//            System.out.println("handled exception successfully");
//        }
//        finally {
//            System.out.println("executing finally block");
//            System.out.println(10/2);
//            System.out.println("closing successfully");
//        }

        int a=48;
        int b=0;

        try{
            int c=a/b;

        }catch (ArithmeticException e){
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }



    }

    // below readFile() method is handling compile time exception using throws keyword
   // private static void readFile(String fileName)  throws FileNotFoundException{
       // FileReader fileReader = new FileReader(fileName);
//        fileReader.read();
       // System.out.println("end of the method!");
   // }
}
