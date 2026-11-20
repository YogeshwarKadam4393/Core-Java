package com.finalKeyword;

public final class FinalExample { // Class final , now this class cannot be extends in child class
	
	final int i = 100;      // After doing variable Final we cannot change the value of i
	
	final  public void m1() {  // final in method , now this method cannot be overRide in child class

		System.out.println("M1 without OverRide");
	
	}
	
	
}
