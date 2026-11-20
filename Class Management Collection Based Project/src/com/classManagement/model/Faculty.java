package com.classManagement.model;

public class Faculty {
	
	int fid;
	String fname;
	Course course;
	
//	------------------------------------------------------------------

	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
//	------------------------------------------------------------------

	@Override
	public String toString() {
	    return  "\n=================================================\n" +
	            "|              FACULTY DETAILS                 |\n" +
	            "=================================================\n" +
	            String.format("| %-15s : %-25s |\n", "Faculty ID", fid) +
	            String.format("| %-15s : %-25s |\n", "Faculty Name", fname) +
	            String.format("| %-15s : %-25s |\n", "Course", course) +
	            "=================================================\n";
	}
	
	
	
}
