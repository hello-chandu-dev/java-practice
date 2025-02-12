package org.example.oops.inhertitance;

public class Manager {
    public static void main(String[] args) {
        Employee  employee=new Employee();
        employee.id=123;
        employee.name="raju";
        employee.salary=50000;

        SalesPerson salesPerson=new SalesPerson();
        salesPerson.designation="marketing head";
        salesPerson.bonus=2000;
        Employee upcasted=new SalesPerson();

        SalesPerson derivedCastedObject  = (SalesPerson) upcasted;
        System.out.println(employee.name+"  "+ employee.id+"  "+employee.salary+" "+salesPerson.designation+"  "+salesPerson.bonus);


    }
}
