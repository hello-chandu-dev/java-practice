package org.example.oops;

public class Primenumbers {
    //given number to check it is prime number
    //check numbers up to half half the given number whether they divided perfectly
    //run a loop up to half half the given number
    //if the each number divided by 23
    //if any number in the loop divides perfectly then immeadltly and break the loop and the number is not prime
    //if perfectly divided we need return as false
    //take a boolean which says that prime num
    //outside the loop if true we can print prime

    public static void main(String[] args) {

//        int num =23;
//        boolean isnotprimenumber = false;
//
//
//        for (int i = 0; i <= num; i++) {
//            if (num % 2 == 0) {
//                continue;
//            }
//            if (isnotprimenumber) {
//                System.out.println("not prime number");
//
//            }
//            else {
//                System.out.println("is prime number");
//            }
//        }

        int num = 9;
        boolean isPrime = true;
        for(int i=2;i<num/2;i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }
    }
}