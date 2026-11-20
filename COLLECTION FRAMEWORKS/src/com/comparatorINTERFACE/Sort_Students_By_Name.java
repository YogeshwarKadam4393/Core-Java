package com.comparatorINTERFACE;

import java.util.Comparator;

public class Sort_Students_By_Name 
implements Comparator<Student> {

	@Override
	public int compare(Student o1,
			           Student o2) {
		return o1.sName.compareTo(o2.sName);
	}

}
