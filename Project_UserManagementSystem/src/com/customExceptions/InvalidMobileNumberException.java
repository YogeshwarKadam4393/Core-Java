package com.customExceptions;

public class InvalidMobileNumberException extends RuntimeException{

	public InvalidMobileNumberException(String msg) {
		super(msg);
	}
}
