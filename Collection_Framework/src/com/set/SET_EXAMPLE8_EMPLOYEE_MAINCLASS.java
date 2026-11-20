package com.set;

import java.util.HashSet;
import java.util.Set;

public class SET_EXAMPLE8_EMPLOYEE_MAINCLASS {

	public static void main(String[] args) {
		
		SET_EXAMPLE8_EMPLOYEE e1 = new SET_EXAMPLE8_EMPLOYEE(101,"Yogesh");
		SET_EXAMPLE8_EMPLOYEE e2 = new SET_EXAMPLE8_EMPLOYEE(101,"Yogesh");
		
		// SET SUPPORTS DUPLICATIONS FOR ONLY PRIMITIVE DATA AND STRING
		// FOR NON PRIMITIVE DATA WE HAVE TO USE EQUALS() AND HASHCODE()
		
		Set<SET_EXAMPLE8_EMPLOYEE> emp = new HashSet<SET_EXAMPLE8_EMPLOYEE>();
		emp.add(e1);
		emp.add(e2);
		
		System.out.println(emp.size()); // BECAUSE WE OVERRIDEN EQUALS() AND HASHCODE() METHODS ,  ITS GIVING 1 OTHERWISE IT GIVES 2

		
	}
}
