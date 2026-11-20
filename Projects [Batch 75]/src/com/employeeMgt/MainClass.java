package com.employeeMgt;

public class MainClass {
	
	public static void main(String[] args) {
		
		Developer d = new Developer();
		d.calculateSalary();
		
		System.out.println("-------------------------------");
		
		Tester t = new Tester();
		t.calculateSalary();
		
		System.out.println("-------------------------------");
		
		Manager m = new Manager();
		m.calculateSalary();
		
	}

}
