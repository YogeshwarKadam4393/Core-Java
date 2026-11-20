package com.customExceptions;

public class InvalidUserIdException extends RuntimeException{
	
	public InvalidUserIdException(String msg) {
		super(msg);
	}

}
