package org.practicaltest.question1;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;
public class Employee {
  int employeeId;
  String employeeName;
  String joiningDate;
  
 public Employee() {
	 
 }
  public Employee(int employeeId, String employeeName, String joiningDate) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.joiningDate = joiningDate;
	
}


public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public String getJoiningDate() {
	return joiningDate;
}
public void setJoiningDate(String joiningDate) {
	this.joiningDate = joiningDate;
}

@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", joiningDate=" + joiningDate
			+ "]";
}
public Employee addEmployee() {
  
  Employee emp= new Employee(employeeId,employeeName,joiningDate);
	return emp;
  }
}