package org.example.practice;

import java.util.Scanner;

public class PrimeNumbersPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("up to what number , do you want me to print the primes: ");
        int inputNo=sc.nextInt();
        PrimeNumbersPrinting primeNumbersPrinting =  new PrimeNumbersPrinting();
        for (int i=3;i<=inputNo;i++){
            if(primeNumbersPrinting.isPrime(i)){
                System.out.print(i+", ");
            }
        }
//        boolean isPrime= primeNumbersPrinting.isPrime(inputNo);
//
//        if (isPrime){
//            System.out.println(inputNo+" is a PrimeNumber");
//        }
//        else {
//            System.out.println(inputNo+" is not a primenumber");
//
//        }
    }

    // i want to print first 100 prime numbers
    // need to check each number starting from  3  - loop starting from number: 3
    // pass each input number to the helper method
    private boolean isPrime(int inputNo){
        for (int i = 2; i <=inputNo/2; i++) {
            if(inputNo%i==0){
                return false;
            }
        }
        return true;
    }
}
