package org.example.oops.inhertitance;

public class TestClass  {
    public static void main(String[] args) {
        ParentClass parent=new ParentClass();
        parent.name="chandana";
        parent.age=23;
        parent.color="white";
        parent.property="property of shares";

        ChildClass child=new ChildClass();
        child.id=123;
        child.salary=125000;
        child.companyName="XYZ";
        System.out.println(parent.name+"  "+child.id+" "+parent.property+"  "+parent.color);

        ParentClass upcasted=new ChildClass();

        ChildClass derivedCastedObject  = (ChildClass) upcasted;



    }
}