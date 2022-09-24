package org.practicaltest.view;
import java.util.Scanner;

import java.util.TreeSet;

import org.practicaltest.service.EntryDetail;
public class StudentView {
	
	static String studentName;
	static String studentId;
	 public static void main(String[] args) {
		 Scanner sc=new Scanner (System.in);
		 TreeSet<org.practicaltest.model.Student> studentdetails=new TreeSet<>();
		 System.out.println("enter setails: Name,Id");
		 for(int i=1;i<=2;i++) {
			 System.out.println(i+").Name");
		     studentName=sc.nextLine();
		     System.out.println(i+").id");
		     studentId=sc.nextLine();
             EntryDetail.storeDetail(studentName,studentId,studentdetails);
         }
		 EntryDetail.printStudent(studentdetails);
		 sc.close();
}
}
