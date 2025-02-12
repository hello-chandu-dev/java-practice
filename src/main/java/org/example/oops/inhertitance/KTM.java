package org.example.oops.inhertitance;

public class KTM extends Bikes{

    String name;
    int year;
    int amount;

public KTM() {

}
public KTM(String name,int year,int amount){
    super();
    this.name=name;
    this.year=year;
    this.amount=amount;
    System.out.println("all arg constructor");

}
public KTM(String name){
    super();
    this.name=name;
    System.out.println("single name constructor");
}
public KTM(int year,int amount){
    super();
    this.year=year;
    this.amount=amount;
    System.out.println("two arg constructor");
}

}
