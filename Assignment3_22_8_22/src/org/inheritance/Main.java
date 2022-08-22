package org.inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employee employeeObj=new Employee("Harry",21,64054112,"Mumbai",52422.2,"IT");
       Manager  managerObj= new Manager ("Bob",43,1452011,"Pune",92426.65,"IT");
       employeeObj.printSalary();
       managerObj.printSalary();
      
	}

}
