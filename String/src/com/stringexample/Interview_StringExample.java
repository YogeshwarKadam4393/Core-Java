package com.stringexample;

public class Interview_StringExample {
	
	public static void main(String[] args) {
		
		String str1 =  "java";
		String str2 = "ja";
		String str3 = str2 + "va";   // Yaha new memory allocate hogi isiliye == me false ayega
		
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3));
	}

}
