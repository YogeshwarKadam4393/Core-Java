package com.stringexample;

// VVIP Question for Interview : String Compare : 1.equals Method | 2. == Operator | 3. compareTo


public class StringExample {

	public static void main(String[] args) {

		String str = " Hi I Am Yogesh ";
		System.out.println(str);
		
		// Method 1 : Trim
		str = str.trim(); // trim is used to remove Empty Spaces from Starting And Ending
		System.out.println(str);

		// Method 2 : toUpperCase   
		str = str.toUpperCase(); // toUpperCase Converts all characters to UpperCase
		System.out.println(str);
		
		// Method 3 : toLowerCase
		str = str.toLowerCase(); // toLowerCase Converts all characters to LowerCase
		System.out.println(str);

		// Method 4 : length()
		System.out.println(str.length()); // In String we are using length Method not length variable

		System.out.println(
				"\n----------------------------------------------------------------------------------------------\n");

		// Logical : String Arrays

		// Method 5 : String ==> Char Array

		char[] arrayOfChar = str.toCharArray();

		for (char c : arrayOfChar) {
			System.out.println(c);
		}

		System.out.println(
				"\n----------------------------------------------------------------------------------------------\n");

		// Method 6 : String ==> Split Method

		String[] arrayOfString = str.split(" "); // Split is used to print the string one after the other and it removes
													// the gaps
		for (String s : arrayOfString) {
			System.out.println(s);
		}
		
		System.out.println(
				"\n----------------------------------------------------------------------------------------------\n");
		
		// Method 7 : String ==> Split Overloaded Method

		String[] arrayOfString1 = str.split(" ",3); // Split is used to print the string one after the other and it removes
													// the gaps
		for (String s1 : arrayOfString1) {
			System.out.println(s1);
		}
		
		// compareAt
		// checking
		// Contains
		// startWith
		// endWith
		// is ==> Method Starting from is are always boolean which means it can be true or false
		// valueOf
		// replace
		// replaceAll
		// subString Single Parameter
		// subString Double Parameter
		// subSequence
		// format
		// join
		// isEmpty
		// indexOf
		// charAt
		

		
		// Method 8 : String ==> Contains
		System.out.println(str.contains("hi"));
		
		// Method 9 : String ==> startWith
		System.out.println(str.startsWith("i"));
		
		// Method 10 : String ==> endWith Method
		System.out.println(str.endsWith("am"));
		
		// Method 11 : String ==> isEmpty Method
		System.out.println(str.isEmpty());

		// Method 12 : String ==> isEmpty Method
		System.out.println(str.isEmpty());
		
		// Method 13 :valueOf ==> Converts Int to String
		int num = 100;
		String value = String.valueOf(num);
		System.out.println(value);
		
		// Method 14 : String ==> replace ---> Replaces Word
		String replaced = str.replace("yogesh", "Yogeshwar");
		System.out.println(replaced);

		// Method 15 : String ==> replaceAll ---> Replaces all Matching Characters
		String replacedAll = str.replaceAll("i", "I");
		System.out.println(replacedAll);

		// Method 16 : String ==> substring (Single Parameter) ----> 👉 Prints from index 2 till end
		System.out.println(str.substring(2));

		// Method 17 : String ==> substring (Double Parameter) ----> 👉 Prints from index 0 to 4
		System.out.println(str.substring(0, 5));

		// Method 18 : String ==> subSequence ----> 👉 Same as substring but returns CharSequence
		System.out.println(str.subSequence(0, 4)); 
		
		// Method 19 : String ==> format ----> 👉 Inserts values inside string
		String formatted = String.format("My Name is %s and length is %d", str, str.length());
		System.out.println(formatted);
		
		// Method 20 : compareTo ---> compareTo() is a String method used to compare two strings lexicographically, meaning dictionary/alphabetical order. It compares characters based on their Unicode values.
		String s1 = "Apple";
		String s2 = "Banana";

		System.out.println(s1.compareTo(s2));
     
		// Method 21 : compareAt ---> charAt() is a String method used to return the character present at a specified index.   
		String name = "Yogesh";

		System.out.println(name.charAt(0));
		System.out.println(name.charAt(3));

	}

}
