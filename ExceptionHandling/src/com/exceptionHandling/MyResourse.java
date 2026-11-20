package com.exceptionHandling;

// Quick Revision Of try With Resourses ---> 🚀

// Defination ---> Try-with-resources means: I open it, I use it, and Java closes it. 😄

//Introduced in	---> Java 7
//Main purpose	---> Automatic resource management
//Resource must implement  ---> AutoCloseable or Closeable
//Close manually?  ---> No
//catch allowed?   ---> Yes
//finally allowed? ---> Yes
//Can Write Multiple resources in one try ?   ---> Yes
//Closing order --->  Reverse declaration order
//Last declared resource  ---> Closed first
//Suppressed exceptions?  ---> Yes
//Access suppressed exceptions	---> getSuppressed()
//Java 9 improvement   ---> final resources can be used directly using its reference
//Common examples   ---> Files, streams, JDBC resources

// Question : Why use finally if try-with-resources automatically closes resources ?
// Answer   : We don't use finally to close a resource that is already managed by try-with-resources. The resource is automatically closed. finally can still be used when we need to execute some other code that must run after the try/catch process, regardless of whether an exception occurs.

//So basically: 1 ---> Try-with-resources = Close my resources .
//              2 ---> Finally = Execute this code anyway .


class MyResource implements AutoCloseable {

	public void use() {
		System.out.println("Using the resource...");
	}

	@Override
	public void close() {
		System.out.println("Resource closed automatically!");
	}

}
