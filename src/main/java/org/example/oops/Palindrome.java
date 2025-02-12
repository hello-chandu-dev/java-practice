package org.example.oops;

public class Palindrome {
    public static void main(String[] args) {
        char [] a=new char[5];
        a[0]='l';
        a[1]='e';
        a[2]='v';
        a[3]='e';
        a[4]='l';

        boolean isPalindrome= true;
        for (int i=0; i<(a.length/2); i++) {
            // check 1st == 5th
            // 2nd == 4th
//            System.out.print(a[i]);
            if (a[i] != a[a.length-i-1]){
                isPalindrome = false;
            }
        }
        if(isPalindrome){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }

            System.out.print(a);

        /* char[] a=new char[7];
        //Rotator
        a[0]='r';
        a[1]='o';
        a[2]='t';
        a[3]='a';
        a[4]='t';
        a[5]='o';
        a[6]='r';
            boolean ispalindrome=true;
        for (int i = 0; i <a.length ; i++) {
           // System.out.println();

            if (a[i] != a[a.length - i - 1]) {
                ispalindrome = false;

            }
        }
            if(ispalindrome){
                System.out.println("Palindrome");
            }
            else{
                System.out.println("Not a Palindrome");
            }


         */

  /*      int a[]={1,0,0,1};
        boolean ispalindrome=true;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != a[a.length - i - 1]) {
                ispalindrome = false;
            }
        }
            if (ispalindrome){
                System.out.println("palindrome");
            }
            else{
                System.out.println("is not palindrome");
            }

*/

        }

    }

