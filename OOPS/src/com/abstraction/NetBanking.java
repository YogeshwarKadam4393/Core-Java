package com.abstraction;

public class NetBanking extends Payment {

	@Override
	public void processPayment() {

		System.out.println("Payment Done With NetBanking");
	}

	public void netBankingMethod() {
		System.out.println("Net Banking");
	}

}
