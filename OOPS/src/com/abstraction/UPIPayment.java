package com.abstraction;

public class UPIPayment extends Payment{

	@Override
	public void processPayment() {

		System.out.println("Payment Done With UPI");
	}

	public void netBankingMethod() {
		System.out.println("UPI");
	}
	

}
