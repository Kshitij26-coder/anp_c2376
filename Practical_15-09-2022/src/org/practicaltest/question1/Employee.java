package org.practicaltest.question1;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;
public class Employee {
  String employeeId;
  String employeeName;
  String joiningDate;
  
 
  public Employee(String employeeId, String employeeName, String joiningDate) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.joiningDate = joiningDate;
	
}


public String getEmployeeId() {
	return employeeId;
}

public String getEmployeeName() {
	return employeeName;
}


public String getJoiningDate() {
	return joiningDate;
}


@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", joiningDate=" + joiningDate
			+ "]";
}
public static void addEmployee(String employeeId,String employeeName,String joiningDate,ArrayList<Employee>empInfo) {
  
  Employee emp= new Employee(employeeId,employeeName,joiningDate);
	empInfo.add(emp);
	System.out.println("employee is added");
	System.out.println("============");
	
  }


}