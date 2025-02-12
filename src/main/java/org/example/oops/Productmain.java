package org.example.oops;

public class Productmain {
    public static void main(String[] args) {
        Product id1=new Product(243,"banana","yellow");
        Product id2=new Product(123,"apple","red");
        Product id3=new Product(234,"pineapple","yellow");

        Product [] productlist=new Product[3];
        productlist[0]=id2;
        productlist[1]=id3;
        productlist[2]=id1;

        for (int i = 0; i < productlist.length ; i++) {
            Product pr=productlist[i];
            System.out.println(pr.getCode()+"__"+pr.getName()+"__"+ pr.getColor());

        }


    }
}
