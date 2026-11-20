package com.inheritance.empMgtSytm;

public class Tester extends Employee {
	
	int numOfBugFixed ;
	
	@Override
	public void setEmployeeDetails() {
		
		eid = 30;
		ename = "Omkar";
		esalary = 200000;
		eexperience = "6+ Years";
		numOfBugFixed = 10;
		
	}
	
	@Override
	public void showDetails() {
		System.out.println("Tester Id: " + getEid());
		System.out.println("Tester Name: " + getEname());
		System.out.println("Tester Salary: " + getEsalary());
		System.out.println("Tester Experience: " + getEexperience());
		System.out.println("Number of Bugs Fixed: "+getNumOfBugFixed());
	}

	public int getNumOfBugFixed() {
		return numOfBugFixed;
	}

	public void setNumOfBugFixed(int numOfBugFixed) {
		this.numOfBugFixed = numOfBugFixed;
	}

	@Override
	public String toString() {
		return "Tester [numOfBugFixed=" + numOfBugFixed + "]";
	}
	
	

}
