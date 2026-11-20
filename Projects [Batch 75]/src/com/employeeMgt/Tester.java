package com.employeeMgt;

public class Tester extends Employee{
	
	@Override
	public double calculateSalary() {
		
		seteSalary(50000);
		
		System.out.println("Tester has 10000 Bonus");
		double salaryWithBonus = geteSalary()+10000;
		System.out.println("Tester Salary : "+salaryWithBonus);
		
		return salaryWithBonus;
	}

}
