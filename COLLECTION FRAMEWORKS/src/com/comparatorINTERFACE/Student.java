package com.comparatorINTERFACE;

public class Student {
	
	int sid;
	String sName;
	int age;
	String subject;
	double marks;
	
	public Student(int sid,
			String sName,
			int age,
			String subject,
			double marks ) {
		this.sid = sid;
		this.sName = sName;
		this.age = age;
		this.subject = subject;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student "
				+ "  sid = " + sid
				+ "  Age = " + age
				+ ", sName = " + sName
				+ ", subject  = " + subject
				+ ", marks = " + marks;
	}
}
