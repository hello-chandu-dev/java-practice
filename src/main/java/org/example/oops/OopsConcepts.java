package org.example.oops;

import org.example.Main;

public class OopsConcepts {
    // OOPs - Java , C++ , Python, C#
    // Structured- C

    // class is a blueprint that is used to create objects and define its behavior
    // methods / functions
    // variables
    // blocks - static / non-static
    // constructors

    // non-static block
    // static block
    {
        System.out.println();
    }

    public static void main(String[] args) {
        // new keyword- used to create objects from class
        // Constructor - used to create an object , It should always have same name as of that class

        int sum = Main.addNumbers(20,80);
        System.out.println("Sum = "+sum);
        Employee[] employeesArray = getEmployees("Hello.. Creating Employees!!");
        for(int i =0; i< employeesArray.length; i++){
            Employee employee = employeesArray[i];
            System.out.println(employee.getEmpId()+", "+employee.getName()+ ", "+employee.getSalary());
        }

//        System.out.println(employeesArray);

    }

    // access specifier - public/protected/default/private
    //  access modifier - static/non-static
    // return type - any data type- eg., int , String , Employee
    // method/function name - any name that is given to a method/ function
    // method arguments - it can be any number of arguments or any type

    public static Employee[] getEmployees(String greeting){
        System.out.println(greeting);

        Employee [] employeeArray  = new Employee[4];

        Employee emp1 = new Employee();
        emp1.setEmpId(1);
        emp1.setName("Chandana");
        emp1.setSalary(120000);
        employeeArray[0] = emp1;

        Employee emp2 = new Employee();
        emp2.setEmpId(2);
        emp2.setName("Praveen");
        emp2.setSalary(10000);
        employeeArray[1] = emp2;

        Employee emp3 = new Employee();
        emp3.setEmpId(3);
        emp3.setName("Xyz");
        emp3.setSalary(12000);
        employeeArray[2] = emp3;

        Employee emp4 = new Employee(4, "Abc", 25000);
        employeeArray[3] = emp4;

        return employeeArray;
    }



}
