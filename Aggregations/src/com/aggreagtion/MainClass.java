package com.aggreagtion;

public class MainClass {

	// Aggregation : Aggregation is a “HAS-A” relationship between two classes where
	// one class contains a reference to another class, but both objects can exist
	// independently.
	
	
	public static void main(String[] args) {

		Course c = new Course();
		c.setcId(401);
		c.setcName("Java FullStacks");
		System.out.println(c);

		System.out.println();

		Faculty f = new Faculty();
		f.setfId(301);
		f.setfName("Nilesh Sir");
		f.setC(c);
		System.out.println(f);

		System.out.println();

		Batch b = new Batch();
		b.setbId(201);
		b.setbName("Batch 75");
		b.setF(f);
		System.out.println(b);

		System.out.println();

		Student s = new Student();
		s.setsId(101);
		s.setsName("Yogesh");
		s.setB(b);
		System.out.println(s);

	}

}
