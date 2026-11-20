package com.set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SET_EXAMPLE6 {
	
	public static void main(String[] args) {
		
		List<Integer> hs = new ArrayList<Integer>();
		
		hs.add(101);
		hs.add(102);
		hs.add(103);
		hs.add(104);
		hs.add(101);
		hs.add(102);
		hs.add(103);
		hs.add(104);
		
		System.out.println(hs);
		
		// TO REMOVE DUPLICATES IN AN ARRAYLIST WE PUTED ARRAYLIST REFERENCE IN LINKEDHASHSET....SO ALL DUPLICATES ARE REMOVED 
		Set<Integer> removeDuplicates = new LinkedHashSet<Integer>(hs);
		System.out.println(removeDuplicates);
		
		
	}

}
