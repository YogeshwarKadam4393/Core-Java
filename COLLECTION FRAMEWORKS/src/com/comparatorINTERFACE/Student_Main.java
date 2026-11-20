package com.comparatorINTERFACE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Student_Main {

	public static void main(String[] args) {

		Student s1 = new Student(104, "David", 23, "Java", 91.10d);
		Student s2 = new Student(111, "Emma", 25, "Python", 88.75d);   
		Student s3 = new Student(102, "Brian", 22, "OS", 78.45d);
		Student s4 = new Student(110, "Jack", 24, "Cloud Computing", 90.25d);
		Student s5 = new Student(106, "Frank", 23, "AI", 92.30d);
		Student s6 = new Student(101, "Andrew", 22, "DBMS", 89.56d);
		Student s7 = new Student(108, "Hannah", 21, "DBMS", 79.60d);
		Student s8 = new Student(105, "Remma", 25, "Python", 88.75d);
		Student s9 = new Student(107, "Grace", 22, "ML", 87.90d);
		Student s10 = new Student(103, "Catherine", 23, "CN", 85.20d);
		Student s11 = new Student(109, "Ian", 24, "Cyber Security", 83.40d);
		Student s12 = new Student(112, "Jemma", 25, "Python", 88.75d);  

		List<Student> studentsList = new ArrayList<Student>();
		Collections.addAll(studentsList, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		
		System.out.println("");
		System.out.println("==========================================================");
		System.out.println("");
		
		System.out.println("|>>>>>>>>>>      Before Sorting      <<<<<<<<<<|");
		for(Student students:studentsList) {
			System.out.println(students);
		}
		System.out.println("");
		System.out.println("==========================================================");
		System.out.println("");
		System.out.println("|>>>>>>>>>>      After Sorting By Marks Then By Age Then By Name      <<<<<<<<<<|");
		Collections.sort(studentsList, new Sort_Students_By_Marks().thenComparing(new Sort_Students_By_Age()).thenComparing(new Sort_Students_By_Name()));
		Iterator<Student> itrStudentsList = studentsList.iterator();
		while(itrStudentsList.hasNext()) {
			Student students = itrStudentsList.next();
			System.out.println(students);
		}
		
//		System.out.println("");
//		System.out.println("==========================================================");
//		System.out.println("");
//		System.out.println("|>>>>>>>>>>      After Sorting By Name      <<<<<<<<<<|");
//		Collections.sort(studentsList, new Sort_Students_By_Name());
//		for(Student students:studentsList) {
//			System.out.println(students);
//		}
//		
//		System.out.println("");
//		System.out.println("==========================================================");
//		System.out.println("");
//		System.out.println("|>>>>>>>>>>      After Sorting By Marks      <<<<<<<<<<|");
//		Collections.sort(studentsList, new Sort_Students_By_Marks());
//		for(Student students:studentsList) {
//			System.out.println(students);
//		}
//		
//		System.out.println("");
//		System.out.println("==========================================================");
//		System.out.println("");
//		System.out.println("|>>>>>>>>>>      After Sorting By Age      <<<<<<<<<<|");
//		Collections.sort(studentsList, new Sort_Students_By_Age());
//		Iterator<Student> itrStudent = studentsList.iterator();
//		while(itrStudent.hasNext()) {
//			Student students = itrStudent.next();
//			System.out.println(students);
//		}
		
	}
}