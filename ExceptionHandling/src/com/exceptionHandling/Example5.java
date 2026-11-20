package com.exceptionHandling;

// VVIMP Interview Questions ----> 

// Question : Can we Write try without Catch Block
// Answer   : Yes, we can write a try block without catch, but it must have a finally block. A try block cannot exist independently.
// Note     : finally is generally used for cleanup activities such as closing files, database connections, or other resources.

// Question : If You are having try , catch , finally block and in that method there is return type then which return will execute if all are having its own return value
// Answer   : If try, catch, and finally all contain return statements, the return statement of the finally block will be executed because finally executes before the method actually returns. Therefore, finally's return value takes precedence over try or catch."
//            try return value is get overrided and hence finally's return value is returned

public class Example5 {
	
	public static void main(String[] args) {
		
		System.out.println("Main Starts");
		
		// try without catch block ---> But here we cant handle the exception , to handle exception we need catch block
		try {
			int i = 10/0;
			System.out.println(i);
		}finally {
			System.out.println("=== Finally Block ===");
		}
		
		System.out.println("Main Ends");
	}

}
