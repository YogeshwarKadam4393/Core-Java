package com.comparableINTERFACE;

public class Student implements Comparable<Student> {
	
	int sid;
	String sName;
	int age;
	String subject;
	double marks;
	
    

	public Student(int sid, String sName,int age, String subject, double marks) {
//		super();
		this.sid = sid;
		this.sName = sName;
		this.age = age;
		this.subject = subject;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid
				+ ", Name=" + sName
				+ ", subject=" + subject
				+ ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student o) {
		
		if(this.sid > o.sid) {
			return 1;
		}else if(this.sid == o.sid) {
			return 0;
		}else {
			return -1;
		}
	}
	
	
}
