package org.example.oops.methodoverloading;

public class MethodOverriding {
    int getRateOfInterest(){
        return 0;
    }

}
class SBI extends MethodOverriding{
    int getRateOfInterest(){
        return 8;
    }
}
class Axis extends MethodOverriding{
    int getRateOfInterest(){
        return 9;
    }

    public static void main(String[] args) {
        SBI s=new SBI();
        System.out.println("SBIrateofinterest:"+s.getRateOfInterest());

        Axis a=new Axis();
        System.out.println("Axisrateofinterest:"+a.getRateOfInterest());
    }

}
