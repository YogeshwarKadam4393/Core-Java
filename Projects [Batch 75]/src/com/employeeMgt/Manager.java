package com.employeeMgt;

public class Manager extends Employee{
	
	@Override
	public double calculateSalary() {
		
		seteSalary(60000);
		
		System.out.println("Manager has 20000 Bonus");
		double salaryWithBonus = geteSalary()+20000;
		System.out.println("Manager Salary : "+salaryWithBonus);
		
		return salaryWithBonus;
	}

}
