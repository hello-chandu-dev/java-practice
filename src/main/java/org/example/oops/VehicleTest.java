package org.example.oops;

public class VehicleTest {
    public static void main(String[] args) {

        TestVehicle vehicle0 = new TestVehicle();
        vehicle0.vehicleYear=123;
        vehicle0.setVname("R15");
        vehicle0.setVcolor("white");
        vehicle0.setModelno(120);
        vehicle0.mileage=23.5;

        TestVehicle vehicle5;
        vehicle5=new TestVehicle("harrier",500);

        System.out.println(vehicle5.getVname()+"  "+vehicle5.getModelno());

        TestVehicle[] vehicleList = new TestVehicle[5];



        TestVehicle vehicle1 = new TestVehicle("audi", "blue", 540, 200);
        TestVehicle vehicle2 = new TestVehicle("BMW", "Black", 200, 220);
        TestVehicle vehicle3 = new TestVehicle("FZ", "red", 2004, 120);
        TestVehicle vehicle4 = new TestVehicle("R15", "white", 250, 150);


            vehicleList[0]=vehicle1;
            vehicleList[1]=vehicle3;
            vehicleList[2]=vehicle2;
            vehicleList[3]=vehicle0;
            vehicleList[4]=vehicle4;

            String [] strList = {"a", "ab", "abc"};
            for(int i =0;i<strList.length;i++){
                String word = strList[i];
                System.out.println(word);
            }

          for (int i = 0; i < vehicleList.length; i++) {
            // retrieving each vehicle to print the details in the next step
            TestVehicle vehicle= vehicleList[i];

            System.out.println(vehicle.getVname()+"  "+vehicle.getModelno()+"  "+vehicle.getSpeed()+"  "+vehicle.getVcolor());

        }
    }
}



