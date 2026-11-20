package com.inheritance.empMgtSytm;

public class Admin {
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		System.out.println("Employee Details -->\n");
		e.setEmployeeDetails();
		e.showDetails();
		
		System.out.println("------------------------------------------------");
		
		System.out.println("Manager Details -->\n");
		Manager m = new Manager();
		m.setEmployeeDetails();
		m.showDetails();
		
		System.out.println("------------------------------------------------");

		System.out.println("Tester Details -->\n");
		Tester t = new Tester();
		t.setEmployeeDetails();
		t.showDetails();
		
		System.out.println("------------------------------------------------");

		System.out.println("Developer Details -->\n");
		Developer d = new Developer();
		d.setEmployeeDetails();
		d.showDetails();
	
	}

}
