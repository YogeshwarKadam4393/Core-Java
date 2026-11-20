package com.typeCasting;

public class ExplicitCasting_Or_Narrowing {
	
	public void m1() {
		
		float f = 7827.3343f;
		long l = (long)f;
		System.out.println(l);
		
		System.out.println();
		
		int i = 2332;
		char c =(char)i;
		System.out.println(c);
		
		System.out.println();
		
		short s = 111;
		byte b = (byte)s;
		System.out.println(b);
		
		System.out.println();
		
		double d = 732732763.343432;
		int i1 = (int)d;
		System.out.println(i1);
		
		System.out.println();

		double d1 = 8232329.234324;
		long l1 = (long)d1;
		System.out.println(l1);
		
		System.out.println();
		
		long l2 = 237263723213l;
		int i3 = (int)l2;
		System.out.println(i3);
		
		System.out.println();
		
		float f3 = 7366276.32432f;
		int i4 = (int)f3;
		System.out.println(i4);
		
	}
	
	public static void main(String[] args) {
		
		ExplicitCasting_Or_Narrowing e = new ExplicitCasting_Or_Narrowing();
		e.m1();
	}

}
