package org.practicaltest.question1;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;


public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  
		  Employee [] eArray= new Employee[5];
		  for(int i =0;i< 5 ;i++) {
			  
			System.out.println("Enter Employee Id: ");
			int employeeId = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Employee Name: ");
			String employeeName = sc.nextLine();
			System.out.println("Enter Employee Joining Date: ");
			String ajoiningDate = sc.nextLine();
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
			
		  }
		
		
		
	}
}
