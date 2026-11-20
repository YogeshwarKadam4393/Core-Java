package com.jdbcBank.service;

import java.sql.Connection;

public interface RBI {
	
	void openAccount(Connection connection);
	void getAccountDetails(Connection connection);
	void getAccountBalance(Connection connection);
	void withdrawFunds(Connection connection);
	void depositFunds(Connection connection);
	void updateAccountDetails(Connection connection);
	void changePIN(Connection connection);
	void deleteAccount(Connection connection);
	
}
