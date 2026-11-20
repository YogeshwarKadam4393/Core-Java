package com.toString;

public class School {
	
	Student s = new Student();
	Teacher t = new Teacher();
	
	public void setStudentDetails() {
		s.setsId(12);
		s.setsName("Yogeshwar");
		s.setsPhnNo(8390188135l);
	}
	
	public void getStudentDetails() {
		System.out.println(s.getsId());
		System.out.println(s.getsName());
		System.out.println(s.getsPhnNo());;
	}
	
	public void setTeacherDetails() {
		t.settId(11);
		t.settName("Nilesh Sir");
		t.settPhnNo(9765764393l);
	}
	
	public void getTeacherDetails() {
		System.out.println(t.gettId());
	    System.out.println(t.gettName());;
	    System.out.println(t.gettPhnNo());;
	}
	
	
	public static void main(String[] args) {
		
		School s1 = new School();
		
		System.out.println("Student Details :");
		s1.setStudentDetails();
		s1.getStudentDetails();
		
		System.out.println("----------------------------------------------------------");
				
		System.out.println("Teacher Details :");
		s1.setTeacherDetails();
		s1.getTeacherDetails();
		
	}

}
