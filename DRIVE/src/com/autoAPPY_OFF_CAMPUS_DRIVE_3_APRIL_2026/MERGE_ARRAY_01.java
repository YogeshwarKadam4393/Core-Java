package com.autoAPPY_OFF_CAMPUS_DRIVE_3_APRIL_2026;

public class MERGE_ARRAY_01 {
	
	
	public static void mergeArrays() {
		
		int[] arr1 = {1, 2, 3};
		int[] arr2 = {4, 5, 6};
		
		int[] merged = new int[arr1.length + arr2.length];
		
		for(int i = 0; i<arr1.length;++i) {
			merged[i] = arr1[i];
		}
		
		for(int i = 0; i< arr2.length; ++i) {
			merged[arr1.length + i] = arr2[i];
		}
		
		System.out.println("Merged Array");
		for(int num:merged) {
			System.out.print(num + " ");
		}
	}
	
	public static void main(String[] args) {
		
		mergeArrays();
	}
}
