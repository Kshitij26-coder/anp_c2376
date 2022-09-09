package org.practicaltest.view;
import org.practicaltest.model.Student;
public class Main {
	public static Student getStudentNameStartingWithA(Student student[]) {
		Student stu=new Student();
		for (int i=0;i<student.length;i++) {
			student[i].getStudentId();
			if(student[i].getStudentId()==1) {
			}
		}
		return stu;
		}
		 	public static void main(String[] args) {
		Student obj1=new Student (1,"Harry");
		Student obj2=new Student (2,"Rahul");
		Student obj3=new Student (3,"Amol");
		Student obj4=new Student (4,"Sachin");
		Student obj5=new Student (5,"Jon");
		
		Student studentArr[]= {obj1,obj2,obj3,obj4,obj5};
		getStudentNameStartingWithA(studentArr);
	}

}
