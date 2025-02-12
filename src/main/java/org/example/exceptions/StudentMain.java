package org.example.exceptions;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) throws InvalidResultException,InvalidHallticketNo {
        Student Stu1 = new Student(5432, "raja", 87);
        Student Stu2 = new Student(5243, "rishi", 75);
        Student Stu3 = new Student(5123, "Praveen", 90);
        Student Stu4 = new Student(5341, "rushi", 65);
        Student Stu5 = new Student(5445, "rajitha", 49);


        List<Student> studentlist = new ArrayList<>();
        studentlist.add(Stu1);
        studentlist.add(Stu2);
        studentlist.add(Stu4);
        studentlist.add(Stu3);
        studentlist.add(Stu5);
        int passPercentage = 50;
        long hallticketNum = 5449;
        boolean isHallticketValid= false;
        // if the given student has a percentage less than 50 , then throw exception else print student details
        for (Student stud : studentlist) {
            if(stud.getHallTicketNo()==hallticketNum){
                isHallticketValid=true;
                if (stud.getPercentage() >= passPercentage) {
                    System.out.println("pass:" + stud);
                }
                else{
                    String exceptionMessage = "student percentage: " + stud.getPercentage() + " is less than pass percentage: " + passPercentage;
                    System.out.println(exceptionMessage);
                    throw new InvalidResultException(exceptionMessage);
                }
            }
        }

        // if hallticket not valid throw invalid hallticket number exception
        if(!isHallticketValid){
            throw  new InvalidHallticketNo("HallticketNo:"+hallticketNum+"is not valid");
        }
    }



    }

