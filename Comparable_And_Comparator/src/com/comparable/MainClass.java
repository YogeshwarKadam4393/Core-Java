package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {

		Student s = new Student(101, "Yogesh");
		Student s1 = new Student(106, "Sarvadnya");
		Student s2 = new Student(102, "Achal");
		Student s3 = new Student(1010, "Sujit");
		Student s4 = new Student(1, "Sakshi");

		List<Student> listOfStudent = new ArrayList<Student>();
		Collections.addAll(listOfStudent, s, s1, s2, s3, s4);

		System.out.println("BEFORE SORTING USING COMPARABLE\n");

		for (Student student : listOfStudent) {
			System.out.println(student);
		}
		
		
		Collections.sort(listOfStudent);
		// Data will be now sorted in ascending order
		System.out.println("\nAFTER SORTING USING COMPARABLE\n");

		for (Student student : listOfStudent) {
			System.out.println(student);
		}

	}

}
