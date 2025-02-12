package org.example.Interfaces.Set;

public class ExceptionHandlingEx {
    public static void main(String[] args) {
        int n=4;
        int m=5;
        int r=0;
        try {

            int ans = m / r;
            int as = n / m;

            System.out.println("ok we can print");
        }
        catch (ArithmeticException e){
            System.out.println("Error");

        }
    }
}
