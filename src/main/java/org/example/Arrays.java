package org.example;



public class Arrays{
    public static void main(String[] args) {

        // 10*10*(10-12)-11 = -200-11 = -211
        // -100 - 12 = -112
        int a =10;
        int b = 11;
        System.out.println(a++*--b*(b-a)-++a);
        // always pre/post increment takes precedence when compared to BODMAS
        //  10*10*(11-10) = 100* 1
//        System.out.println(a+++a);
//        10 + 11
//        System.out.println(a);
        // pre increment - a = a+1
//        int[] ar={10,21,30,40};

//        System.out.println(6/3*7-1);
//        System.out.println(3*4-10/(5-3)*(7+2));
//        System.out.println(1*(4/2)-10+1);


//        System.out.println(ar[ar.length*1-2]);
        // ar[1]
//        for (int i = 0; i <ar.length ; i++) {
//            if (ar[i] % 7 ==0) {
//                continue;
//            }
//
//            System.out.println(ar[i]);
//        }



        /*int[]a=new int[5];
        a[0]=3;
        a[1]=4;
        a[2]=6;
        a[3]=4;
        a[4]=8;
        System.out.println(a[0]+a[4]);*/

        /*char []a= new char[7];
        a[0]='s';
        a[1]='t';
        a[2]='u';
        a[3]='d';
        a[4]='e';
        a[5]='n';
        a[6]='t';

        System.out.println(a[3]);
        System.out.println(a[6]);

        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);


        }*/


    }
}