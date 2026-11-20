package com.equalsAndHashcode;

import java.util.LinkedHashSet;
import java.util.Set;

public class Employee_Main {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(101, "Steve");
		Employee e2 = new Employee(101, "Steve");
//		Employee e3 = new Employee(102, "Dustin");
//		Employee e4 = new Employee(103, "Mike");
//		Employee e5 = new Employee(104, "Lucas");
//		Employee e6 = new Employee(105, "Hoper");
		
		Set<Employee> empSet = new LinkedHashSet<Employee>();
		empSet.add(e1);
		empSet.add(e2);
//		empSet.add(e3);
//		empSet.add(e4);
//		empSet.add(e5);
//		empSet.add(e6);
		
		System.out.println("");
		System.out.println("---------------------------------------");
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println("---------------------------------------");
		System.out.println("");
		System.out.println("---------------------------------------");
		System.out.println(empSet.size());
		System.out.println(e1.equals(e2));
		System.out.println("---------------------------------------");
	}
}
