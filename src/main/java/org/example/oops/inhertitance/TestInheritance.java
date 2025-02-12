package org.example.oops.inhertitance;

public class TestInheritance {

    public static void main(String[] args) {
//        Vehicle base = new Vehicle();
//        base.getName();
//        TataBus tata = new TataBus();
//        tata.getName();
//        Suzuki suzuki = new Suzuki();
//        suzuki.getName();

//        Vehicle vehicle = new Tata();
//        vehicle.getName();
//        vehicle = new Suzuki();
//        vehicle.getName();

        Suzuki su  = new Suzuki();
        su.getName();
        su.cheap();

        Vehicle vc  = new Suzuki();
        vc.getName();
//        vc.cheap(); // compilation error because - we have upcasted to parent class level (Vehicle) - as cheap() method is not available in the parent class it gives error
    }
}
