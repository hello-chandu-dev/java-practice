package org.example.oops.inhertitance;

public class Suzuki extends Vehicle{
    public Suzuki(){
        super();
        System.out.println("Suzuki class constructor");
    }
    public void getName(){
        System.out.println("Suzuki vehicle");
    }

    public void cheap(){
        System.out.println("Cheap price car");
    }
}
