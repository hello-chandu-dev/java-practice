package org.example.Interfaces;

public class JumboMobile implements FlagshipMobile{
    @Override
    public void graphics() {
        System.out.println(" JumboMobile :::  graphics - YES");
    }

    @Override
    public void camera() {
        System.out.println("JumboMobile :::  Camera - YES");
    }

    @Override
    public void playstore() {
        System.out.println("JumboMobile :::  playstore - YES");
    }

    @Override
    public void call() {
        System.out.println("JumboMobile :::  HD calling - YES");
    }
}
