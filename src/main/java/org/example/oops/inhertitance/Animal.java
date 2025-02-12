package org.example.oops.inhertitance;

public class Animal {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.behave="barking";
        Golden g=new Golden();
        g.fetch="fetching";
        g.habit="eating";
        System.out.println(g.fetch);

    }
}
    class Dog extends Animal{
        String behave;
    }
    class Golden extends Dog{
        String fetch;
        String habit;
    }


