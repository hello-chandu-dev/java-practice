package org.example.oops.inhertitance;

public class WashingMachine extends Machine{

    @Override
    public void name(){
        System.out.println("Washing machine");
    }

    public void wash(){
        System.out.println("Washing");
    }
}
