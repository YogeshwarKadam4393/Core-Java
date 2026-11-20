package com.toString;

public class Student {
	
	int sId;
	String sName;
	long sPhnNo;
	
	
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public long getsPhnNo() {
		return sPhnNo;
	}
	public void setsPhnNo(long sPhnNo) {
		this.sPhnNo = sPhnNo;
	}
	
	
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sPhnNo=" + sPhnNo + "]";
	}
	
	

}
