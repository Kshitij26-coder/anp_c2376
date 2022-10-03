package org.practicaltest.model;
import java.util.Scanner;
public class Student  {
	 private String studentId;
	private String studentName;
	
    Scanner sc=new Scanner(System.in);
    public Student() {
    	
    }
	public Student(String studentName, String studentId) {
		this.studentName=studentName;
		this.studentId=studentId;
	}


	public String getStudentId() {
		return studentId;
	}


	public void setStudentId(String studentId) {
		
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		
		this.studentName = studentName;
		
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", sc=" + sc + "]";
	}



	
}
  