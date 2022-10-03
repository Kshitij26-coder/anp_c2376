package org.practicaltest.dao;
import org.practicaltest.model.Student;
import org.practicaltest.service.StudentService;

import java.util.Scanner;

import java.util.TreeSet;
public class DAO{
public static String studentName;
public static String studentId;
    

public static void main(String[] args) {
	TreeSet <Student> stud=new TreeSet<Student>();
	Scanner sc=new Scanner(System.in);
	boolean result=false;
	for (int i=1;i<=2;i++) {
		System.out.println(i+ "Name");
		studentName=sc.nextLine();
		System.out.println(i+ "Id");
		studentId=sc.nextLine();
		
	}
	System.out.println(stud.add(null));
	
	
}
}
