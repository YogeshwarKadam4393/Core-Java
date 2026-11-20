package com.autoAPPY_OFF_CAMPUS_DRIVE_3_APRIL_2026;

public class FIRST_NON_REPEATING {
	
	public static void main(String[] args) {
		
		String str = "maharashtra";
		
		for(int i = 0;i< str.length(); ++i) {
			char ch = str.charAt(i);
			
			if(str.indexOf(ch) == str.lastIndexOf(ch)) {
				System.out.println(ch);
				break;
			}
		}
	}
}
