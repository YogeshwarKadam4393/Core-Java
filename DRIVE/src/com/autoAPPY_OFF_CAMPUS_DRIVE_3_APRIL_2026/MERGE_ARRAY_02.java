package com.autoAPPY_OFF_CAMPUS_DRIVE_3_APRIL_2026;

public class MERGE_ARRAY_02 {
	
	
	public static void main(String[] args) {
		
		int[] arr1 = {1, 3, 5};
		int[] arr2 = {2, 6, 9};
		
		int[] merged = new int[arr1.length + arr1.length];
		
		for(int i = 0; i < arr1.length; ++i) {
			merged[i] = arr1[i];
		}
		
		for(int i = 0; i< arr2.length; ++i) {
			merged[arr1.length + i] = arr2[i];
		}
		
		System.out.print("Merged array :- " );
		for(int num:merged) {
			System.out.print(num + " ");
		}
	}
}
