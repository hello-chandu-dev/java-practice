package org.example.oops.inhertitance;

public class Cooker extends Machine {
    private int items;
    private String name;

    String abc;
    public Cooker(){
    }

    public Cooker(int items){
        this.items = items;
        System.out.println("Cooker class --- Items Constructors...");
    }

    public Cooker(String name){
        this.name = name;
        System.out.println("Cooker class name --- Constructors...");
    }

    public Cooker(String name, int items){
        this.name = name;
        this.items = items;
        System.out.println("Cooker class All Constructors...");
    }

    @Override
    public void name() {
        System.out.println("Inside cooker class name() ");
        System.out.println(this.name);

    }

    public void cook(){
        System.out.println("Inside cooker class cook() ");
        System.out.println("Cooking: "+this.items +" items!");
    }
}
