package com.typeCasting;

public class Implicit_Or_Widening {

	public void m1() {

		byte b = 100;
		int i = b;
		System.out.println(i);

		System.out.println();

		short s = 200;
		long l = s;
		System.out.println(l);

		System.out.println();

		float f = 3223.322f;
		double d = f;
		System.out.println(d);

		System.out.println();

		int i1 = 200;
		long l1 = i1;
		System.out.println(l1);

		System.out.println();

		char c = 'K';
		int i2 = c;
		System.out.println(i2);

		System.out.println();
		
		long l5 = 268282323l;
		float f5 = l5;
		System.out.println(f5);

//	byte b2 = 100;
//	char c2 = b2;         ---> Byte & Short Implicit Casting is Not Possible But Char to int & Long is Possible

// Reason --> byte aur short signed data types hain, jabki char unsigned data type hai. 
		   // Kyunki byte aur short negative values rakh sakte hain aur char nahi, 
		//    isliye Java data loss ya incorrect interpretation se bachne ke liye implicit conversion allow nahi karta. Sirf explicit casting allowed hai.		

	}

	public static void main(String[] args) {

		Implicit_Or_Widening a = new Implicit_Or_Widening();
		a.m1();

	}

}
