package com.covarientReturnType;

public class Q extends P{
	
	int j = 200;
	
	@Override
	public P m1() {
		
		Q q = new Q();

		System.out.println(q.i);
		System.out.println(q.j);
		
		return q;
	}

}
