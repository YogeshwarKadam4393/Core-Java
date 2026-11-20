package com.autoAPPY_OFF_CAMPUS_DRIVE_3_APRIL_2026;

import java.awt.dnd.peer.DragSourceContextPeer;

public class CHECK_IS_PRIME_02 {
	
	public static void main(String[] args) {
		
		int num = 9;
		
		boolean flag = true;
		while(flag) {
			
			if(num <= 1) {
				System.out.println("not prime");
				return;
			}
			
			boolean isprime = true;
			for(int i = 2; i<=Math.sqrt(num);++i) {
				if(num % i == 0) {
					isprime = false;
					break;
				}
			}
			if(isprime) {
				System.out.println("Is prime");
			}else {
				System.out.println("Not Prime");
			}
			
		}
	}

}
