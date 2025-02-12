package org.example;

import org.example.oops.TestVehicle;

public class AccessSpecifierTest {

    public static void main(String[] args) {
        TestVehicle vehicle = new TestVehicle();
        vehicle.setVname("Abc"); // this can only be accessed using getter/setter/constructor - because it is declared as private
                                    // ---  private variables can only be accessed within the same class
        vehicle.vehicleYear= 23; //We can access the vehicleYear variable as it is declared as public
//        vehicle.mileage=43.4; --> it gives an error because it is declared a default variable
//        --- As the current class is outside the package of the Vehicle class, we cannot access the mileage variable
    }
}
