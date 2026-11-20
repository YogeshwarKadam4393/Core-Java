package com.comparatorINTERFACE;

import java.util.Comparator;

public class Sort_Students_By_Age 
implements Comparator<Student> {

	@Override
	public int compare(Student o1,
			           Student o2) {
		// TODO Auto-generated method stub
		if(o1.age > o2.age) {
			return 1;
		}else if(o1.age == o2.age) {
			return 0;
		}else {
			return -1;
		}
	}	
}
