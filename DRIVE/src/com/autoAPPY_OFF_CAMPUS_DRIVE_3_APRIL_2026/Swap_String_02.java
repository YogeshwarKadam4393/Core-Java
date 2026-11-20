package com.autoAPPY_OFF_CAMPUS_DRIVE_3_APRIL_2026;

public class Swap_String_02 {
	
	public static void main(String[] args) {
		
		String str = "MONKEY";
		String add = "";
		
		for(int i = 0; i < str.length();++i) {
			
			if(i==0) {
				add += str.charAt(str.length()-1);
			}else if(i==str.length()-1) {
				add += str.charAt(0);
			}else {
				add += str.charAt(i);
			}
		}
		System.out.println(add);
	}
}
