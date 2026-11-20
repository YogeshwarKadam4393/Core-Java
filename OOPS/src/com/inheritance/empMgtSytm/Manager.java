package com.inheritance.empMgtSytm;

public class Manager extends Employee{

	int teamSize;
	
	@Override
	public void setEmployeeDetails() {
		
		eid = 20;
		ename = "Tejas";
		esalary = 100000;
		eexperience = "5+ Years";
		teamSize = 12;
		
	}
	
	@Override
	public void showDetails() {
		System.out.println("Manager Id: " + getEid());
		System.out.println("Manager Name: " + getEname());
		System.out.println("Manager Salary: " + getEsalary());
		System.out.println("Manager Experience: " + getEexperience());
		System.out.println("Team size: "+getTeamSize());
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	@Override
	public String toString() {
		return "Manager [teamSize=" + teamSize + "]";
	}


	
	
}
