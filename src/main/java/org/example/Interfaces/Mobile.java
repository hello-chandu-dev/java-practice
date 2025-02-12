package org.example.Interfaces;

public interface Mobile {

    void camera();
    void playstore();

    default void call(){
        System.out.println("Call with default implementation");
    }
}
