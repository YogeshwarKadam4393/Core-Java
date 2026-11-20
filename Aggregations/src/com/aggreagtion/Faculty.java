package com.aggreagtion;

public class Faculty {
	
	private int fId;
	
	private String fName;
	
	Course c ;

	public int getfId() {
		return fId;
	}

	public void setfId(int fId) {
		this.fId = fId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public Course getC() {
		return c;
	}

	public void setC(Course c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Faculty [fId=" + fId + ", fName=" + fName + ", c=" + c + "]";
	}
	
	

}
