package org.example.oops.inhertitance;

public class WagnoR extends SuzukiCar{

    @Override
    int drive() {
        return 1;
    }

    @Override
    int capacity() {
        return 500;
    }

    @Override
    String power() {
        return "extrodinary";
    }
}
