package com.equalsAndHashcode;

import java.util.Objects;

public class Employee {
	
	int eid;
	String ename;
	
	public Employee(int eid, String ename) {
		this.eid = eid;
		this.ename = ename;
	}

	@Override
	public int hashCode() {
		return Objects.hash(eid, ename);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return eid == other.eid && Objects.equals(ename, other.ename);
	}
	
	
}
