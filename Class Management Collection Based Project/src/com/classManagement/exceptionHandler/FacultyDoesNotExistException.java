package com.classManagement.exceptionHandler;

public class FacultyDoesNotExistException extends RuntimeException {
	
	public FacultyDoesNotExistException(String errMsg) {
		super(errMsg);
	}
}
