package com.classManagement.exceptionHandler;

public class BatchDoesNotExistException extends RuntimeException {
	
	public BatchDoesNotExistException(String errMsg) {
		super(errMsg);
	}
}
