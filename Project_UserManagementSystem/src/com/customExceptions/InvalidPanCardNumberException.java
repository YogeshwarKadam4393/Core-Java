package com.customExceptions;

public class InvalidPanCardNumberException extends RuntimeException{

	public InvalidPanCardNumberException(String msg) {
		super(msg);
	}
}
