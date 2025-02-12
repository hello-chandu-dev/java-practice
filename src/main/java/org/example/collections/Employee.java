package org.example.collections;

import java.util.ArrayList;

public class Employee {

    private String name;

    private double salary;
    private String Dept;


    public Employee() {

    }
    public Employee(String name,double salary,String dept){
        this.name=name;
        this.salary=salary;
        this.Dept=dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", Dept='" + Dept + '\'' +
                '}';
    }
}
