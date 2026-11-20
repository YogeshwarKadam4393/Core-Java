package com.set;

import java.util.HashSet;
import java.util.Set;

public class SET_EXAMPLE7 {
	
	public static void main(String[] args) {
		
		
		String s1 = "Yogesh";
		String s2 = new String("Yogesh");
		String s3 = "Yog";
		String s4 = s3 + "esh";
		String s5 = "yogesh";
		
		Set<String> hs = new HashSet<String>();
		hs.add(s1); // WILL GET ADD
		hs.add(s2); // SET DONT ALLOW DUPLICATE VALUES
		hs.add(s3); // WILL GET ADD BECAUSE IT HAS ONLY : Yog
		hs.add(s4); // DUPLICATE VALUE 
		hs.add(s5); // WILL GET ADD
		
		System.out.println(hs.size());
		
	}

}
