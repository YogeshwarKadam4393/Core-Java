package com.jdbcBank.model;

public class AccountNoGenerator {
	
	public static long generateAccountNo() {
		
		long accountNo = (long)(Math.random()*Math.pow(10, 9) + 1000000000l);
		return accountNo;
	}
}
