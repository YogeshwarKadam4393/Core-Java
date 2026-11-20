package com.covarientReturnType;

public class P {
	
	int i = 100;
	
	public P m1() {
		
		P p = new P();
		System.out.println(p.i);
		
		return p;
	}

}
