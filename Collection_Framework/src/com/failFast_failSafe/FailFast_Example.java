package com.failFast_failSafe;

import java.util.ArrayList;

public class FailFast_Example {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(101);
		al.add(102);
		al.add(103);
		
		for (Integer integer : al) {
			al.add(104);              // WE CANNOT DO MANUPULATION OPERATION DURING ITERATION IN FAIL FAST
									  // IT WILL THROW CONCURRENTMODIFICATIONEXCEPTION
			System.out.println(al);
		}
	} 

}
