package org.example.oops;

public class Student {
    private long rollno;
    private String name;
    private double marks;
    public Student()
    {

    }

    public long getRollno() {
        return rollno;
    }

    public void setRollno(long rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public Student(long rollno, String name, double marks){
        this.rollno = rollno;
        this.name=name;
        this.marks=marks;

    }
}
