package org.inheritance;

public class Manager extends Member {
      private String department;
      public Manager(String name,int age,long phoneNumber,String address, double salary, String department)
      {
    	  super(name, age, phoneNumber, address, salary);
    	  this.department =department;
      }

}
