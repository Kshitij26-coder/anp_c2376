package org.practicaltest.model;

public class Student implements Comparable<Student> {
	 private String studentId;
	private String studentName;
	

	public Student(String studentName, String studentId) {
		this.studentName=studentName;
		this.studentId=studentId;
	}



	public String getStudentId() {
		return studentId;
	}


	
	public String getStudentName() {
		return studentName;
	}



	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}

    @Override
    public int compareTo(Student s) {
    	String scurrent =this.getStudentName();
    	String sprev = s.getStudentName();
    	
    	int com =scurrent.compareTo(sprev);
    	return com;
    }
}
