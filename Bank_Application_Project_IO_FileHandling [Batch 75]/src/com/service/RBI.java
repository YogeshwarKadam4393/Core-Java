package com.service;

import java.io.IOException;

public interface RBI {
	
	void createAccount() throws IOException;
	
	void displayAccountDetails() throws IOException;
	
	void checkBalance();
	
	void depositAmount();
	
	void withdrawAmount();
	
	void updateDetails();
	
	void updatePhoneNumber();
	
	void updateAddress();

	void updateAadharNumber();
	
	void updatePanNumber();
	
	void updateName();
	
	void updateEmail();
	
	void showFileInformation() throws IOException;

	void backupFile() throws IOException;
	
	void deleteFile() throws IOException;
}
