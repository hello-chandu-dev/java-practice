package org.example.oops.inhertitance.testing;

public class Vehicle extends Object{
    String name;
    int year;
    public void getname(){
        System.out.println("base vehicle");


    }
    public Vehicle(){

    }

    public Vehicle(String name){
        this.name=name;

    }
    public Vehicle(int year){
        this.year=year;
    }
    public Vehicle(String name,int year){
        this.name=name;
        this.year=year;
    }

}