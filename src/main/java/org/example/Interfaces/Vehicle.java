package org.example.Interfaces;

public interface Vehicle {
    void drive();
    void capacity();
     default void driver(){
         System.out.println("driver is important");
     };


}
