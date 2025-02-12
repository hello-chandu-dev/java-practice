package org.example.oops.access.Strings;

public class Main {
    public static void main(String[] args) {
        System.out.println(Cat.getCatcount());
     Cat mycat=new Cat();
        mycat.age=2;
        mycat.name="Stella";
        mycat.meow();
        Cat cat2 = new Cat();
        System.out.println(Cat.getCatcount());
    }

}
