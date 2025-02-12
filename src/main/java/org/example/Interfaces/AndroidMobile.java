package org.example.Interfaces;

public class AndroidMobile implements Mobile{
    @Override
    public void camera() {
        System.out.println("Keypad mobile :::  Camera - YES");
    }

    @Override
    public void playstore() {
        System.out.println("Keypad mobile ::: Playstore - YES");
    }

    @Override
    public void call() {
        System.out.println("Android Mobile Implementation");
    }
}
