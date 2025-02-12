package org.example.oops.access.Strings;

public class Tester {
    public static void main(String[] args) {
        Bike bike=new Bike();
        bike.model_no=276;
        bike.name="R15";

        System.out.println(bike.model_no);

        Car car=new Car();
        car.speed=230;
        System.out.println(car.speed);

    }
}
