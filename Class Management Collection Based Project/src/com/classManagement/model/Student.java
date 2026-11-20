package com.classManagement.model;

public class Student {
	
	int sid;
	String sname;
	Batch batch;
	
//	------------------------------------------------------------------

	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Batch getBatch() {
		return batch;
	}
	public void setBatch(Batch batch) {
		this.batch = batch;
	}
	
//	------------------------------------------------------------------

	@Override
	public String toString() {
	    return  "\n=================================================\n" +
	            "|              STUDENT DETAILS                 |\n" +
	            "=================================================\n" +
	            String.format("| %-15s : %-25s |\n", "Student ID", sid) +
	            String.format("| %-15s : %-25s |\n", "Student Name", sname) +
	            String.format("| %-15s : %-25s |\n", "Batch", batch) +
	            "=================================================\n";
	}}
	
	

