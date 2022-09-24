package org.practicaltest.service;
import java.util.Iterator;
import java .util.NoSuchElementException;
import java.util.TreeSet;
import org.practicaltest.model.Student;

public class EntryDetail {
	public static void storeDetail(String studentName, String studentId,TreeSet<Student>stdInfo) {
		Student stu =new Student(studentName,studentId);
		
		stdInfo.add(stu);
		System.out.println("Student is added successfully");
		System.out.println("========================");
	}

	public static void printStudent(TreeSet<Student> ts) {
		Iterator<Student> itr=ts.iterator();
		Student s=null;
		try {
		while ((s=itr.next())!=null) {
			System.out.println(s);
		}
		}catch(NoSuchElementException e) {
			System.out.println("Done");
		}
		
	}
}
