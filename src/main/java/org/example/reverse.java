package org.example;

public class reverse {
    public static void main(String [] args){
        char [] a=new char[12];
        a[0]='H';
        a[1]='a';
        a[2]='p';
        a[3]='p';
        a[4]='y';
        a[5]='b';
        a[6]='i';
        a[7]='r';
        a[8]='t';
        a[9]='d';
        a[10]='a';
        a[11]='y';
        for (int i=a.length-1;i>=0; i--) {
            System.out.print(a[i]);
        }



    }
}
