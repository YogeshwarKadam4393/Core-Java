package com.classManagement.model;

public class Batch {
	
	int bid;
	String bname;
	Faculty faculty1;
	Faculty faculty2;
	
//	------------------------------------------------------------------
	
	

	public int getBid() {
		return bid;
	}
	public Faculty getFaculty1() {
		return faculty1;
	}
	public void setFaculty1(Faculty faculty1) {
		this.faculty1 = faculty1;
	}
	public Faculty getFaculty2() {
		return faculty2;
	}
	public void setFaculty2(Faculty faculty2) {
		this.faculty2 = faculty2;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}

//	------------------------------------------------------------------

	@Override
	public String toString() {
	    return  "\n=================================================\n" +
	            "|                BATCH DETAILS                  |\n" +
	            "=================================================\n" +
	            String.format("| %-15s : %-25s |\n", "Batch ID", bid) +
	            String.format("| %-15s : %-25s |\n", "Batch Name", bname) +
	            String.format("| %-15s : %-25s |\n", "Faculty 1", faculty1) +
	            String.format("| %-15s : %-25s |\n", "Faculty 2", faculty2) +
	            "=================================================\n";
	}
	
	
	
}