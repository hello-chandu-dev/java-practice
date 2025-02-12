package org.example.collections;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.*;

public class  EmpDetails {
    public static void main(String[] args) {

        Employee emp = new Employee("raju", 50000, "hr");
        Employee emp1 = new Employee("rani", 20000, "attender");
        Employee emp2 = new Employee("ramana", 10000, "cleaner");
        Employee emp3 = new Employee("Praveen", 150000, "ceo");
        Employee emp4 = new Employee("chandu", 75000, "manager");
        Employee emp5 = new Employee("rajashekar", 105000, "Manager");
        Employee emp6 = new Employee("rashi", 85000, "teamleader");
        Employee emp7 = new Employee("ramesh", 45000, "delivery");
        Employee emp8 = new Employee("santhosh", 35000, "delivery");
        Employee emp9 = new Employee("raghu", 15000, "officeboy");
        Employee emp10 = new Employee("lalitha", 25000, "worker");
        List<Employee> empList = new ArrayList<>();
        empList.add(emp);
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);
        empList.add(emp6);
        empList.add(emp7);
        empList.add(emp8);
        empList.add(emp9);
        empList.add(emp10);
       double incrementamount=5000;


            for (int i = 0; i < empList.size(); i++) {
            Employee empObj = empList.get(i);
            if(empObj.getSalary() >= 10000 && empObj.getSalary() <= 20000){
                double newsalary=empObj.getSalary()+incrementamount;
                System.out.println(empObj+"    "+newsalary);
                empObj.setSalary(empObj.getSalary()+incrementamount);

                System.out.println(empObj);

            }
        }
        System.out.println(empList);


//        System.out.println("===========");
//        for(Employee empObj: empList){
//            if(empObj.getSalary() >= 10000 && empObj.getSalary() <= 20000){
//                System.out.println(empObj);
//            }
//        }
//        System.out.println("========");
//        Iterator<Employee> iterator = empList.iterator();
//        while(iterator.hasNext()){
//            Employee empObj = iterator.next();
//            if(empObj.getSalary() >= 50000 && empObj.getSalary() <= 100000){
//                System.out.println(empObj);
//            }
//        }
    }
}






