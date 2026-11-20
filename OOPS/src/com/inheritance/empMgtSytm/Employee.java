package com.inheritance.empMgtSytm;

public class Employee {

	int eid;
	String ename;
	double esalary;
	String eexperience;

	public void setEmployeeDetails() {

		setEid(10);
		setEname("Yogeshwar");
		setEsalary(9000000.9999);
		setEexperience("10+ Years");
	}

	public void showDetails() {
		System.out.println("Employee Id: " + getEid());
		System.out.println("Employee Name: " + getEname());
		System.out.println("Employee Salary: " + getEsalary());
		System.out.println("Employee Experience: " + getEexperience());
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getEsalary() {
		return esalary;
	}

	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}

	public String getEexperience() {
		return eexperience;
	}

	public void setEexperience(String eexperience) {
		this.eexperience = eexperience;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", eexperience=" + eexperience
				+ "]";
	}

}
