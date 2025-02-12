package org.example.oops;

public class TataCar extends CarAbstractClassExample{

    @Override
    int getSeats() {
        return 7;
    }

    @Override
    String getCarName() {
        return "Tata car";
    }

    @Override
    String getPower() {
        return "1000 CC";
    }
}
