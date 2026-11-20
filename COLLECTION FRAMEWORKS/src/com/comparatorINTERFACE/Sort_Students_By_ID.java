package com.comparatorINTERFACE;

import java.util.Comparator;

public class Sort_Students_By_ID 
implements Comparator<Student> {

	@Override
	public int compare(Student o1,
			           Student o2) {
		
		if(o1.sid > o2.sid) {
			return 1;
		}else if(o1.sid == o2.sid) {
			return 0;
		}else {
			return -1;
		}
	}	
}
