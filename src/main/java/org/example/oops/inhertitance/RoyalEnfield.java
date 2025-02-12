package org.example.oops.inhertitance;

public class RoyalEnfield extends Bikes{
     int year;
    double amount;
    public RoyalEnfield(){

    }
    public RoyalEnfield(int year,double amount){
        this.year=year;
        this.amount=amount;
        System.out.println("two arg con");
    }
    public RoyalEnfield(int year) {
        this.year = year;
    }
        public RoyalEnfield(double amount){
            this.amount=amount;

        }

    }


