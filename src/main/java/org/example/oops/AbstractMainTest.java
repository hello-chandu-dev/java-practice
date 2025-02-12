package org.example.oops;

public class AbstractMainTest {
    public static void main(String[] args) {
        CarAbstractClassExample car = new SuzukiCar();
        System.out.println(car.getCarName());
        System.out.println(car.getSeats());
        System.out.println(car.getPower());

        car = new TataCar();
        System.out.println(car.getCarName());
        System.out.println(car.getSeats());
        System.out.println(car.getPower());


        AnimalAbstractClassExample obj3 = new Cow();
        System.out.println(obj3.getliters());
        System.out.println(obj3.getbread());

    }
}
