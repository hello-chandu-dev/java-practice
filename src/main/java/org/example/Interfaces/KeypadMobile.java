package org.example.Interfaces;

public class KeypadMobile implements Mobile{
    @Override
    public void camera() {
        System.out.println("Keypad mobile ::: No Camera");
    }

    @Override
    public void playstore() {
        System.out.println("Keypad mobile ::: No Playstore");
    }

//    @Override
//    public void call() {
//        System.out.println("Keypad Mobile Implementation");
//    }
}
