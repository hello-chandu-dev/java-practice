package org.example.oops.access.Strings;

public class Cat {

    private static int catcount;
    String name;

    int age;

    int livesremaining;

    public void meow() {

    }

    public Cat() {
        catcount++;

    }

    public static int getCatcount() {
        return catcount;
    }


}
