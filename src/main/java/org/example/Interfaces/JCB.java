package org.example.Interfaces;

public class JCB implements Vehicle{
    @Override
    public void drive() {
        System.out.println("driving is important");
    }

    @Override
    public void capacity() {

    }

    @Override
    public void driver() {
        Vehicle.super.driver();
    }
}
