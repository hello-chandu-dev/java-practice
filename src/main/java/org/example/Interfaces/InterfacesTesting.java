package org.example.Interfaces;

public class InterfacesTesting {
    public static void main(String[] args) {
        Mobile mobile = new KeypadMobile();
        mobile.call();
        mobile.camera();
        mobile.playstore();
        System.out.println("-----------");
        mobile = new AndroidMobile();
        mobile.call();
        mobile.camera();
        mobile.playstore();
        System.out.println("---------");
        mobile = new JumboMobile();
        mobile.call();
        mobile.playstore();
        mobile.camera();
        FlagshipMobile flagshipMobile = (FlagshipMobile)mobile;
        flagshipMobile.graphics();

    }
}
