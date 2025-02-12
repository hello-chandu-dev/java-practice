package org.example.Scanner;

import java.io.File;
import java.util.Scanner;


public class Practice {
    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your name");
//        String name=sc.next();
//        System.out.println("your name is:"+name);
//        sc.close();
        File file = new File("//Users//praveenkamalapuram//learnings//java//workspaces//practice//chandu-java-practice//src//main//java//org//file");

        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            System.out.println(sc.nextLine());

        }

    }
}
