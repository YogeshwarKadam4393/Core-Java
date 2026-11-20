package com.Static_Keyword;


public class Employee {

	//Static Keyword is used at the Class Level 
	//Static keyword is used where there are common things in program
	//It can be Applied at variable,method,block,inner class or Nested Class
	//It is Initialized at Class Loading
	
	private int pid;
	private String pName;
	private String pAddress;
	private static String pCity;
	private static String pCompanyName;
	
	
	public void setCommonData() {

		setpCity("Pune");
		setpCompanyName("Google");
	}
	   
    public static String getCommonData() {

        return "\nEmployee City: " + getpCity()
                + "\nEmployee Company: " + getpCompanyName();
    }
	
//	public AllEmployees allEmployees(){
//		
//		AllEmployees all = new AllEmployees();
//		
//		all.e.
//		
//		return all;
//				
//	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpAddress() {
		return pAddress;
	}

	public void setpAddress(String pAddress) {
		this.pAddress = pAddress;
	}

	public static String getpCity() {
		return pCity;
	}

	public static void setpCity(String pCity) {
		Employee.pCity = pCity;
	}

	public static String getpCompanyName() {
		return pCompanyName;
	}

	public static void setpCompanyName(String pCompanyName) {
		Employee.pCompanyName = pCompanyName;
	}

	@Override
	public String toString() {
		return "Employee [pid=" + pid + ", pName=" + pName + ", pAddress=" + pAddress + "]";
	}

}
