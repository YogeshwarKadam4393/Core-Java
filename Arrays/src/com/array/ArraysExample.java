package com.array;


public class ArraysExample {
	
	public static void main(String[] args) {
		
		String[] arrayOfString = new String[5];
		
		arrayOfString[0] = "Yogesh";
		arrayOfString[1] = "Sujit";
		arrayOfString[2] = "Omkar";
		arrayOfString[3] = "Lalit";
		arrayOfString[4] = "Tejas";
		
		System.out.println(arrayOfString[0]);
		System.out.println(arrayOfString[1]);
		System.out.println(arrayOfString[2]);
		System.out.println(arrayOfString[3]);
		System.out.println(arrayOfString[4]);

 		System.out.println("\nLength of Array : "+arrayOfString.length); // length is a variable not method & is used to find the length of array
		
	}

}
