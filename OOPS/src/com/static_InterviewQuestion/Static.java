package com.static_InterviewQuestion;

//Static to Static:
//No object is required. A static method can directly access static variables and static methods using their name (or the class name).

//Non-Static to Static:
//An object must be created because a static method cannot directly access non-static (instance) variables or methods.

//             --------- OR --------

//Static → Static:
//Access directly. No object is needed.

//Non-Static → Static:
//Object is required to access non-static members.


public class Static {
	
	int id = 101;
	static String name = "Yogesh";
	
	public void nonStaticMethod() {
		System.out.println(id);
		System.out.println(name);

	}
	
	public static void staticMethod(){
		Static s = new Static();
		System.out.println(s.id);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		Static s1 = new Static();
		
		System.out.println(s1.id);
		System.out.println(name);
		
		s1.nonStaticMethod();
		staticMethod();
	}

}
