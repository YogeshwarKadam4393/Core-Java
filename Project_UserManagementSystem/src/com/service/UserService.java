package com.service;

import com.customExceptions.InvalidChoiceException;

public interface UserService {
	
	public void registerUser() throws InvalidChoiceException;
	public void displayAllUserDetails();
	public void updateUserDetails() throws InvalidChoiceException;
	public void deleteUserDetails();
	

}
