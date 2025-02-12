package org.example.Interfaces;

interface Animal{
    void sound();
    void sleep();

}
class Pig implements Animal {
    public void sound() {
        System.out.println("WEE WEE");
    }


    public void sleep() {
        System.out.println("ZZzzzzzzzz");
    }
}

public class Program {
    public static void main(String[] args) {
        Pig obj=new Pig();
        obj.sound();
        obj.sleep();
    }
}
