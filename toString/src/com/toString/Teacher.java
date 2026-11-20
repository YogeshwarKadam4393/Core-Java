package com.toString;

public class Teacher {
	
	int tId;
	String tName;
	long tPhnNo;
	
	
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	public long gettPhnNo() {
		return tPhnNo;
	}
	public void settPhnNo(long tPhnNo) {
		this.tPhnNo = tPhnNo;
	}
	
	
	@Override
	public String toString() {
		return "Teacher [tId=" + tId + ", tName=" + tName + ", tPhnNo=" + tPhnNo + "]";
	}
	
	

}
