package com.employeeMgt;

public class Developer extends Employee{
	
	@Override
	public double calculateSalary() {
		
		seteSalary(30000);
		
		System.out.println("Developer has 5000 Bonus");
		double salaryWithBonus = geteSalary()+10000;
		System.out.println("Developer Salary : "+salaryWithBonus);
		
		return salaryWithBonus;
	}

}
