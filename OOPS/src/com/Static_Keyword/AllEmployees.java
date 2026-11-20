package com.Static_Keyword;

public class AllEmployees extends Employee {

	public void allEmployees() {

		Employee e = new Employee();
		e.setPid(101);
		e.setpName("Yogesh");
		e.setpAddress("Pcmc");
		e.setCommonData();
		System.out.println("Employee Id: " + e.getPid() +"\n"+ "Employee Name: "+e.getpName()+"\n"+"Employee Address: "+e.getpAddress()+Employee.getCommonData());
		
		System.out.println("---------------------------------------------------------");

		Employee e1 = new Employee();
		e1.setPid(102);
		e1.setpName("Tejas");
		e1.setpAddress("Nigdi");
		System.out.println("Employee Id: " + e1.getPid() +"\n"+ "Employee Name: "+e1.getpName()+"\n"+"Employee Address: "+e1.getpAddress()+Employee.getCommonData());
		
		System.out.println("---------------------------------------------------------");

		Employee e2 = new Employee();
		e2.setPid(103);
		e2.setpName("Omkar");
		e2.setpAddress("Akurdi");
		System.out.println("Employee Id: " + e2.getPid() +"\n"+ "Employee Name: "+e2.getpName()+"\n"+"Employee Address: "+e2.getpAddress()+Employee.getCommonData());

	}

}
