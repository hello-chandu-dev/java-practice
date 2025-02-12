package org.example.exceptions;

public class Student {
    private long hallTicketNo;
    private String name;
    private int percentage;

    public Student(long hallTicketNo,String name,int percentage){
       this.hallTicketNo=hallTicketNo;
       this.name=name;
       this.percentage=percentage;
    }

   @Override
   public String toString() {
      return "Student{" +
              "hallTicketNo=" + hallTicketNo +
              ", name='" + name + '\'' +
              ", percentage=" + percentage +
              '}';
   }

   public long getHallTicketNo() {
      return hallTicketNo;
   }

   public void setHallTicketNo(long hallTicketNo) {
      this.hallTicketNo = hallTicketNo;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getPercentage() {
      return percentage;
   }

   public void setPercentage(int percentage) {
      this.percentage = percentage;
   }
}

