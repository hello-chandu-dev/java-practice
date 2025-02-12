package org.example.oops;

public class EmployeeMain {

    private static String orgName= "ABC Software Solutions";
    public static void main(String[] args) {
        Employee employee0 = new Employee();
       employee0.setName("abc");
        employee0.setEmpId(13);
        employee0.setSalary(12323);

        Employee employee1 = new Employee(10, "praveen", 10000);
        Employee employee2 = new Employee(11, "chandana", 20000);
        Employee employee3 = new Employee(12, "pk", 30000);

        Employee employee4 = new Employee("xyz", 40000);

//        System.out.println(employee0.getName()+" -> "+employee0.getEmpId());

        Employee [] employeeList = new Employee[5];
        employeeList[0] = employee2;
        employeeList[1] = employee1;
        employeeList[2] = employee3;
        employeeList[3] = employee0;
        employeeList[4] = employee4;
        for(int i =0; i< employeeList.length;i++){
            Employee emp = employeeList[i];
            System.out.println(emp.getEmpId() + " - "+emp.getName() + " - "+ emp.getSalary());
        }
    }
}
