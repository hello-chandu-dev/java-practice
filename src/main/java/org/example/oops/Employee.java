package org.example.oops;

public class Employee {

    private long empId;
    private String name;
    private double salary;

    // constructor - used to initialize values / create objects
    // No arguments / default constructor
    public Employee(){

    }

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    // initializes values - all argument constructor
    public Employee(long empId, String name, double salary){
        this.empId= empId;
        this.name = name;
        this.salary = salary;
    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
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

//    public static String getOrgName() {
//        return orgName;
//    }
//
//    public static void setOrgName(String orgName) {
//        Employee.orgName = orgName;
//    }


    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
