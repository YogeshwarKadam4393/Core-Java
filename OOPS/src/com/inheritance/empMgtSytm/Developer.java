package com.inheritance.empMgtSytm;

public class Developer extends Employee {
	
	String programmingLang ;
	
	@Override
	public void setEmployeeDetails() {
		
		eid = 40;
		ename = "Yogeshwar";
		esalary = 9000000.0;
		eexperience = "15+ Years";
		programmingLang = "Java";
		
	}
	
	@Override
	public void showDetails() {
		/*
		 * System.out.println("developer Id: " + getEid());
		 * System.out.println("developer Name: " + getEname());
		 * System.out.println("developer Salary: " + getEsalary());
		 * System.out.println("developer Experience: " + getEexperience());
		 * System.out.println("Programming Language: "+getProgrammingLang());
		 */	
	
		super.showDetails();
		System.out.println("Programming Language: "+getProgrammingLang()  );
	
	}

	public String getProgrammingLang() {
		return programmingLang;
	}

	public void setProgrammingLang(String programmingLang) {
		this.programmingLang = programmingLang;
	}

	@Override
	public String toString() {
		return "Developer [programmingLang=" + programmingLang + "]";
	}
	
	

}
