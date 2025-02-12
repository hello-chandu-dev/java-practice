package org.example.oops.inhertitance.testing;

public class Car extends Vehicle{
    double safetyRating;
    double comfortRating;

    private String name;
    private  int year;

    public Car(){

    }

    public Car(double safetyRating,double comfortRating){
      this.safetyRating=safetyRating;
      this.comfortRating=comfortRating;

    }

    public Car (String name,int year,double safetyRating,double comfortRating){
//        this(safetyRating, comfortRating);
        super(name, year);
       this.safetyRating=safetyRating;
       this.comfortRating=comfortRating;


    }
    public void getCarDetails(){

        System.out.println(super.name+"     "+super.year+"    "+safetyRating+"    "+comfortRating);
    }

}
