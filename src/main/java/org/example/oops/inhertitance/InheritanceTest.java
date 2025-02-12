package org.example.oops.inhertitance;

public class InheritanceTest {
    public static void main(String[] args) {
        BaseClass baseClass = new BaseClass();
        baseClass.abc = "parent set property";
        baseClass.protectedProperty="aaaaaa";
//        baseClass.age=12; // parent class cannot access the properties of child class


        DerivedClass derivedClass = new DerivedClass();
        derivedClass.abc="Derived set property"; // property of base class but still accesible here due to inheritance
        derivedClass.xyz = "world";
        derivedClass.protectedProperty = "ppppppp"; // accessible only via inheritance
        derivedClass.age = 12;
        System.out.println(baseClass.protectedProperty+ " --- "+derivedClass.protectedProperty);

//        Vehicle asd = new DerivedClass();
        // here derived(child) class object is upcasted to Parent class
        BaseClass upcastedObject = new DerivedClass(); // here parent class can hold the instance of child class -- vice versa is not possible
//        DerivedClass baseObject = new BaseClass();
//        System.out.println(upcastedObject.xyz); -- cannot access child class properties because we have upcasted the child object to parent class

        // Down casting - bringing back the upcasted object in to its original state / child state
        DerivedClass derivedCastedObject  = (DerivedClass) upcastedObject; // here we have downcasted the earlier upcasted object to its original state
        System.out.println(derivedCastedObject.xyz);
        System.out.println(derivedCastedObject.protectedProperty);
    }
}
