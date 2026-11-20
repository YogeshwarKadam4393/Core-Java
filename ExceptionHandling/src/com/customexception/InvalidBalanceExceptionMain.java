package com.customexception;

public class InvalidBalanceExceptionMain {

	public static void main(String[] args) throws AgeValidation {

		System.out.println("=============== Invalid Balance Checking =================");

		try {
			withdrawBalance(1000, 500);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void withdrawBalance(int balance, int ammount) throws AgeValidation {

		if (balance < ammount) {
			throw new AgeValidation("Insufficient Balance...!!");
		} else {
			System.out.println("Ammount Withdrawen Successfull...!!");
		}
	}

}
