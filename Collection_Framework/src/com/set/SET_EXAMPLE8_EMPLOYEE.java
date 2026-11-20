package com.set;

import java.util.Objects;

public class SET_EXAMPLE8_EMPLOYEE {
	
	int id;
	String name;
	
	
	// IN SET 
	// IF U WANT TO COMPARE OBJECTS WE HAVE TO USE EQUALS() METHOD AND HASHCODE() METHOD
	// WE HAVE TO OVERRIDE OBJECT CLASS METHODS
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SET_EXAMPLE8_EMPLOYEE other = (SET_EXAMPLE8_EMPLOYEE) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	public SET_EXAMPLE8_EMPLOYEE(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	

}
