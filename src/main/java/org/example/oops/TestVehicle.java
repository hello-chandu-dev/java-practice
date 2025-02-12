package org.example.oops;

public class TestVehicle {

    public int vehicleYear;
    double mileage;
    private String Vname;
    private String Vcolor;
    private int modelno;
    private double speed;

    public String getVname() {
        return Vname;
    }

    public void setVname(String vname) {
        Vname = vname;
    }

    public String getVcolor() {
        return Vcolor;
    }

    public void setVcolor(String vcolor) {
        Vcolor = vcolor;
    }

    public int getModelno() {
        return modelno;
    }

    public void setModelno(int modelno) {
        this.modelno = modelno;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public TestVehicle() {

    }

    public TestVehicle(String Vname, String Vcolor, int modelno, double speed){
        this.Vname=Vname;
        this.Vcolor=Vcolor;
        this.modelno=modelno;
        this.speed=speed;
    }

    public TestVehicle(String Vname, int modelno){
        this.Vname=Vname;
        this.modelno = modelno;

    }
}