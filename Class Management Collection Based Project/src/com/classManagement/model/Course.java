package com.classManagement.model;

public class Course {
	
	int cid;
	String cname;
	
//	------------------------------------------------------------------

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}
	
//	------------------------------------------------------------------

	@Override
	public String toString() {
	    return  "\n=================================================\n" +
	            "|               COURSE DETAILS                  |\n" +
	            "=================================================\n" +
	            String.format("| %-15s : %-25s |\n", "Course ID", cid) +
	            String.format("| %-15s : %-25s |\n", "Course Name", cname) +
	            "=================================================\n";
	}
	
	

}
