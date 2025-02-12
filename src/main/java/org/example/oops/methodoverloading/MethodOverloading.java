package org.example.oops.methodoverloading;

public class MethodOverloading {

    public int add(int a,int b){
        return a+b;
    }
    //changing the return type will not come under over loading
//    public double add(int a,int b){
//        return a+b;
//    }

    // no of arguments changed
    public int add(int a,int b,int c){
        return a+b+c;
    }

    public double add(double a,double b){
        return a+b;
    }
    public double add(int a,double b){
        return a+b;
    }

    public double add(double a,int b){
        return a+b;
    }

    public static void main(String [] args){
        MethodOverloading methodOverloading=new MethodOverloading();
        int result =methodOverloading.add(2,3);
        System.out.println(result);
       double total =methodOverloading.add(20.5,25.5);
        System.out.println(total);
       int value= methodOverloading.add(3,4,6);
        System.out.println(value);
        double sum=methodOverloading.add(20.5,5);
        System.out.println(sum);
        double result2=methodOverloading.add(5,25.5);
        System.out.println(result2);
    }
}



