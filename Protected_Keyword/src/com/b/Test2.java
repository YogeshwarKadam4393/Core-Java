package com.b;
import com.a.Test1;


// Question : "I'm inside the child class (Test2), so why can't I call it?"
// Answer   : protected access is checked using the reference type, not the object type.

// Question : "Can a variable of type Test1 access m1() from package com.b?"
// Answer   : Test1 belongs to another package (com.a)
//            Protected members are not accessible through a parent class reference in another package.
//            So the compiler stops before runtime.

// Question : Why can't we create a parent object?
// Answer   : A protected member in another package is accessible only through inheritance.
//            But here it is simply creating a parent object.
//            You're neither in the same package nor accessing through a subclass.
//            So access is denied.


public class Test2 extends Test1{
	
	@Override   
	protected void m1() {     // Protected Keyword is used When we want our data should be get accessed only which class will extend this class 
		super.m1();                 
		System.out.println("M1 method of Test2 Class");
	}
	
	public static void main(String[] args) {
		
//		Test1 t = new Test2();
//		t.m1();
//		
//		Test1 t1 = new Test1();
//		t1.m1();
		
		Test2 t2 = new Test2();
		t2.m1();
	}

}
