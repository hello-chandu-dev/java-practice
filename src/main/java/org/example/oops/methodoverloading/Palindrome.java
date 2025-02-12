package org.example.oops.methodoverloading;

public class Palindrome {
    public static void main(String[] args) {


        char[] a = new char[5];
        a[0] = 'l';
        a[1] = 'e';
        a[2] = 'v';
        a[3] = 'e';
        a[4] = 'l';
        boolean ispalindrome = true;
        for (int i = 0; i < (a.length/2); i++) {
// The loop will only check the first half of the array since the second half is a mirror image
            if (a[i] != a[a.length - i - 1]) {
                // This effectively compares the characters at the beginning and end of the word.
                ispalindrome = false;

            }


        }

        if(ispalindrome){
            System.out.println("is a palindrome");
        }
        else{
            System.out.println("is not palindrome");

        }
        System.out.println(a);


    }
}