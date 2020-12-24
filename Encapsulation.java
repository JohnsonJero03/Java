package com.company;

public class Encapsulation {
   public static void main(String[] args)
   {
       beanStud b = new beanStud();

       b.setAge(20);
       b.setFirstName("firstname Comes Here");
       b.setLastName("Lastname Comes Here");

       System.out.println(b.getFirstName() +"\n"+b.getLastName()+"\n"+b.getAge());
   }
}
