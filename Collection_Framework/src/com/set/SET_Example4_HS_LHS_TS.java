package com.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// SET ---> 1. HASH SET | 2. LINKED HASH SET | 3. TREE SET
// SET PROPERTIES ---> ALL PROPERTIES ARE INVERSE OF LIST IN SET
// 1. INSERTION ORDER NOT FOLLOWED
// 2. INDEX NOT MAINTAINED
// 3. RANDOM ACCESS NOT POSSIBLE
// 4. NO DUPLICATES ARE ALLOWED , ELEMENTS SHOULD BE UNIQUE
// 5. CAN ADD ONLY ONE NULL ELEMENT

public class SET_Example4_HS_LHS_TS {
	
	public static void main(String[] args) {
		
		// DUPLICATES ARE NOT ALLOWED
		System.out.println("=========== HASH SET ==========");
		
		Set<String> names =  new HashSet<String>();
		names.add("Yogesh");
		names.add("Sujit");
		names.add("Omkar");
		names.add("Tejas");
		names.add("Yogesh");
		names.add("Sujit");
		names.add("Omkar");
		names.add("Tejas");
		names.add(null);
		names.add(null);
		
		for (String string : names) {
			System.out.println(string);
		}
		
		// DUPLICATES ARE NOT ALLOWED + INSERTION ORDER FOLLOW
		System.out.println("\n=========== LINKED HASH SET ==========");
		
		Set<String> lhs =  new LinkedHashSet<String>();
		lhs.add("Yogesh");
		lhs.add("Sujit");
		lhs.add("Omkar");
		lhs.add("Tejas");
		lhs.add("Yogesh");
		lhs.add("Sujit");
		lhs.add("Omkar");
		lhs.add("Tejas");
		lhs.add(null);
		lhs.add(null);
		
		for (String string : lhs) {
			System.out.println(string);
		}
		
		// DUPLICATES ARE NOT ALLOWED + ASCENDING SORTING BY DEFAULT
		// SORTING CAN BE : ASCENDDING & DESCENDING
		System.out.println("\n=========== TREE SET ==========");
		
		Set<String> ts =  new TreeSet<String>();
		ts.add("Yogesh");
		ts.add("Sujit");
		ts.add("Omkar");
		ts.add("Tejas");
		ts.add("yogesh");
		ts.add("sujit");
		ts.add("omkar");
		ts.add("tejas");
		ts.add("Abhishek");
		ts.add("aditya");
      //ts.add(null);      // Null Values Are Not Allowed , As it will throw NullPointerException
		
		
		for (String string : ts) {
			System.out.println(string);
		}
		
	}

}
