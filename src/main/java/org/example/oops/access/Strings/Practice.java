package org.example.oops.access.Strings;

public class Practice {
    /*public static void main(String[] args) {


        int a = 25;
        boolean isaprimenumber;
        for (int i = 2; i <a/2 ; i++) {
            if (i % a == 0) {
                System.out.println("is a primenumber");
            }
        }

            else{
                System.out.println("is not a prime number");
            }

        }
*/
    // we need take a number ,and find out its prime number or not
    //we need to check the given number is divisible or  using with the loop
    // if the given number is dividible by given number then its shows is prime number
    //or else the result will come


    // take a number as input integer
    // take a boolean and initialize it to true. This will tell us if the given number is prime or not
    // write a loop - starting from 2 till num/2 ., eg., to check if 13 is prime , we need to iterate only till 6
    // inside the loop put a condition that if any of the numbers in the loop divides the given number(num % i == 0) ;
    // break the loop when any of the number perfectly divides the given number - set the boolean to false
//    public static void main(String[] args) {
//        int num = 17;
//        boolean isPrime = true;
//        for(int i = 2;i<=num/2;i++){
//            if(num % i == 0){
//                isPrime =false;
//                break;
//            }
//        }
//        if(isPrime){
//            System.out.println("Prime");
//        }
//        else {
//            System.out.println("Composite");
//        }
//    }

    // Palindrome - MADAM
// given string to convert as char array
    //take boolean and initialization true
    //write a loop-loop has to be run half lessthan i<num/2
    //we need to write a condition to check the 1st position and last position of given array
    //char[array]!=char[num-i-1],then its need to break ,then set boolean to true

//    public static void main(String[] args) {
//
//        String name="mahasm";
//        char[] chars = name.toCharArray();
//        int num=name.length();
//        boolean ispalindrome=true;
//        for (int i = 0; i <num/2; i++) {
//            System.out.println(i+" -- "+chars[i]);
//            System.out.println(num-i-1+" -- "+chars[num-i-1]);
//            if(chars[i]!=chars[num-i-1]){
//                ispalindrome=false;
//                break;
//            }
//        }
//        if(ispalindrome){
//            System.out.println("palindrome");
//        }
//        else{
//            System.out.println("not a palindrome");
//        }

//    public static void main(String[] args) {
//        String name="noon";
//       char []array= name.toCharArray();
//       int length=name.length();
//       boolean ispalindrome=true;
//        for (int i = 0; i < length/2; i++) {
//            System.out.println(i+"--"+array[i]);
//            System.out.println(length-i-1+"--"+array[length-i-1]);
//            if(array[i]!=array[length-i-1]){
//                ispalindrome = false;
//                break;
//            }
//        }
//        if(ispalindrome){
//            System.out.println(" palindrome");
//        }
//        else {
//            System.out.println("not a palindrome");
//        }
public static void main(String[] args) {
    int num=97;
    boolean isaprimenumber=true;
    for (int i = 2; i < num/2; i++) {
        if(num%i==0){
            isaprimenumber=false;
            break;


    }
}
    if(isaprimenumber){
        System.out.println("prime");
    }
else{
        System.out.println("not a prime");
    }
    }




    }

