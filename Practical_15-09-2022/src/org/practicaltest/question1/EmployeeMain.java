package org.practicaltest.question1;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;


public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  ArrayList<Employee> em= new ArrayList<Employee>();
		  
		  for(int i =0;i< 2 ;i++) {
			  
			System.out.println("Enter Employee Id: ");
			String employeeId = sc.nextLine();
			
			System.out.println("Enter Employee Name: ");
			String employeeName = sc.nextLine();
			System.out.println("Enter Employee Joining Date: ");
			String joiningDate = sc.nextLine();
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
			Employee.addEmployee(employeeId, employeeName, joiningDate, em);
		  }
		
		
		
	}
}
