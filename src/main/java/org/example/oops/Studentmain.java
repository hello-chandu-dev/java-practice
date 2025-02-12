package org.example.oops;

public class Studentmain {
    public static void main(String[] args) {
        Student[] Students=new Student[3];
        Students[0]=new Student(10,"rani",85);
        Students[1]=new Student(11,"raju",89);
        Students[2]=new Student(12,"mani",79.5);

        for (int i = 0; i < Students.length; i++) {

            Student st=Students[i];
            System.out.println(st.getRollno()+"  "+st.getName()+"  "+st.getMarks());
        }
    }
}
