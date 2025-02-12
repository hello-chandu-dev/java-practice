package org.example.oops.inhertitance;

public class PressureCooker extends Cooker{
    @Override
    public void name() {
        System.out.println("Pressure Cooker!!");
    }

    @Override
    public void cook() {
        System.out.println("Cooks Curries!!");
    }
}
