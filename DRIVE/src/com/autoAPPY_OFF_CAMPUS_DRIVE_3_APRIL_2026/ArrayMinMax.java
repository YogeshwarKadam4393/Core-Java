package com.autoAPPY_OFF_CAMPUS_DRIVE_3_APRIL_2026;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayMinMax {
	
	public static void main(String[] args) {
		
		int[] arrayint = {89,34,29,10,37,57,38,78,34,43,98,54};
		
		int max = arrayint[0];
		int min = arrayint[0];
		
		for(int i = 1; i < arrayint.length; ++i) {
			
			if(arrayint[i] > max) max = arrayint[i];
			if(arrayint[i] < min) min = arrayint[i];
		}
		
		System.out.println("----------------------");
		System.out.println("-- Max ---> " + max);
		System.out.println("----------------------");
		System.out.println("-- Min ---> " + min);
		System.out.println("----------------------");
		
		Arrays.sort(arrayint);
		System.out.println(Arrays.toString(arrayint));
	}
}
