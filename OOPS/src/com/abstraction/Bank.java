package com.abstraction;

public class Bank {
	
	public static void main(String[] args) {
		
		Payment pay = new NetBanking(); // This is loose Coupling : That is mix object
		pay.validateUser();
		pay.processPayment();
		pay.generateBill();
		
		System.out.println("-----------------------------------------------------");
		
		Payment pay1 = new UPIPayment(); // This is loose Coupling : That is mix object
		pay1.validateUser();
		pay1.processPayment();
		pay1.generateBill();
		
		System.out.println("-----------------------------------------------------");
		
		UPIPayment pay2 = new UPIPayment(); // This is Tight Coupling : That is Child object
		pay1.validateUser();
		pay1.processPayment();
		pay1.generateBill();
		
	}

}
