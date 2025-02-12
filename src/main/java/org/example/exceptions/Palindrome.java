package org.example.exceptions;

public class Palindrome {
    public static void main(String[] args) {
        char a[] = new char[5];
        a[0] = 'l';
        a[1] = 'e';
        a[2] = 'v';
        a[3] = 'e';
        a[4] = 'l';

        boolean isaPalindrome = true;
        //Checking the Length Of the half the woed
        for (int i = 0; i < (a.length / 2); i++) {
            //here we are checking the positions of char like
            // 0 to 4 th position
            if (a[i] != a[a.length - i - 1]) {
                isaPalindrome=false;
            }
            if(isaPalindrome){
                System.out.println("It is A Palindrome");
            }
            else {
                System.out.println("It is not a Palindrome");
            }
        }
    }
}
