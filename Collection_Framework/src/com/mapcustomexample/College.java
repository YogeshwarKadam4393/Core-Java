
package com.mapcustomexample;

import java.util.HashMap;
import java.util.Map;

public class College {

	public Map<Integer, Student> getStudent() {
		
		Student s1 = new Student(101, "Yogesh", "Pune");
		Student s2 = new Student(102, "Sujit", "Pune");
		Student s3 = new Student(103, "Sarvadnya", "Pune");
		
		// Map
		
		Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
		studentMap.put(1, s1);
		studentMap.put(2, s2);
		studentMap.put(3, s3);
		
		return studentMap;

		
	}

}
