package com.abstraction;

public abstract class Payment {
	
	public void validateUser() {
		System.out.println("User Validate Method");
	}
	
	public abstract void processPayment();
	
	public void generateBill() {
		System.out.println("Bill generated Successfully");
	}
	
}
