package org.example.demo;
import org.example.model.Employee;
public class EmployeeView {
	public static void main(String[] args) {
		
		Employee empObj=new Employee();
		empObj.setEmployeeId(56);
		
		int id =90;
		empObj.setEmployeeId(id);
		
		
	}
	public static void newMain(String[] args) {
		Employee get = new Employee();
		get.getEmployeeId();
		
	}

}
