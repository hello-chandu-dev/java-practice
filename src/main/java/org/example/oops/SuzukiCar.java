package org.example.oops;

public class SuzukiCar extends CarAbstractClassExample{


    @Override
    int getSeats() {
        return 5;
    }

    @Override
    String getCarName() {
        return "Suzuki";
    }

    @Override
    String getPower() {
        return "500 CC";
    }
}
