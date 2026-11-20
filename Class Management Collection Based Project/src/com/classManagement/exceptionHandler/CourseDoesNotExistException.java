package com.classManagement.exceptionHandler;

public class CourseDoesNotExistException extends RuntimeException {
	
	public CourseDoesNotExistException(String errMsg) {
		super(errMsg);
	}
}
