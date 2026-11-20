package com.customExceptions;

public class InvalidAadharNumberException extends RuntimeException {
	
	public InvalidAadharNumberException(String msg) {
		super(msg);
	}

}
