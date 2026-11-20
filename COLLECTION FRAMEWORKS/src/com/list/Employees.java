package com.list;

public class Employees {
	
	int eid;
	String ename;
	long econtact;
	
	Employees(int eid, String ename, long econtact){
		this.eid = eid;
		this.ename = ename;
		this.econtact = econtact;
	}

	@Override
	public String toString() {
		return " "
			+ "\n  eid       = " + eid 
			+ "\n, ename     = " + ename
			+ "\n, econtact  = " + econtact;
	}
	
	

}
