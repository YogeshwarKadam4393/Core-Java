package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {

		Employee s = new Employee(101, "Yogesh");
		Employee s1 = new Employee(106, "Sarvadnya");
		Employee s2 = new Employee(102, "Achal");
		Employee s3 = new Employee(1010, "Sujit");
		Employee s4 = new Employee(1, "Sakshi");

		List<Employee> listOfEmployee = new ArrayList<Employee>();
		Collections.addAll(listOfEmployee, s, s1, s2, s3, s4);

		System.out.println("BEFORE SORTING USING COMPARATOR\n");

		for (Employee student : listOfEmployee) {
			System.out.println(student);
		}
		
		
		Collections.sort(listOfEmployee , new SortEmployeeById());
		// Data will be now sorted in ascending order by Id 
		System.out.println("\nAFTER SORTING USING COMPARATOR BY ID\n");

		for (Employee employee : listOfEmployee) {
			System.out.println(employee);
		}
		
		
		Collections.sort(listOfEmployee , new SortEmployeeByName());

		// Data will be now sorted in ascending order by Names
		System.out.println("\nAFTER SORTING USING COMPARATOR  BY NAME\n");

		for (Employee employee : listOfEmployee) {
			System.out.println(employee);
		}

	}

}
