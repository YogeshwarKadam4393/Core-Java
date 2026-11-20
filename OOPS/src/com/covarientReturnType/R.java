  package com.covarientReturnType;

public class R extends Q{
	
	int k = 300;
	
	
	@Override
	public Q m1() {
		
		R r = new R();
		System.out.println(r.i);
		System.out.println(r.j);
		System.out.println(r.k);
		
		return r;
	}
	
	
	public static void main(String[] args) {
		
//		R r1 = new R();
//		r1.m1();
		
		Q q1 = new Q();
		q1.m1();
		
//		P p1 = new P();
//		p1.m1();
	}

}
