package org.example.Interfaces;



@FunctionalInterface
interface sayable{
    void say();
}

 class functionalinter implements sayable{
    @Override
    public void say() {
        System.out.println("hello");
    }
}
public class Practice1 {

    public static void main(String[] args) {
        functionalinter file=new functionalinter();
        file.say();
    }




}
