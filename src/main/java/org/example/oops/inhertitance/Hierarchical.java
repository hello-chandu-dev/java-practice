package org.example.oops.inhertitance;
public  class Hierarchical{
    public static void main(String[] args) {
        Hierarchical h1=new Hierarchical();
        Bike b1=new Bike();
        b1.speed=123;
        h1.name="moving";
          Hierarchical upcasted=new Bike();
          Bike down=(Bike) upcasted;
        System.out.println(h1.name+"  "+b1.speed);
    }
        String name ;


    }

    class Bike extends Hierarchical{
        int speed;


    }
    
    class Car extends Hierarchical{
        String race;
    }



