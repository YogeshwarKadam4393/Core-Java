package com.customExceptions;

public class InvalidChoiceException extends RuntimeException{

	public InvalidChoiceException(String msg){
		super(msg);
	}

}
