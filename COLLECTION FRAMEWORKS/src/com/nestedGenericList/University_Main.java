package com.nestedGenericList;

import java.util.Iterator;
import java.util.List;

public class University_Main {
	
	public static void main(String[] args) {
		
		University university = new University();
		
		List<List<String>> SPPU = university.universityList();
		
		System.out.println("");
		System.out.println("----------------------------------");
		System.out.println("|>>> USING ITERATOR INTERFACE <<<|");
		System.out.println("----------------------------------");
		System.out.println("");
		
		Iterator<List<String>> itrSPPU = SPPU.iterator();
		while(itrSPPU.hasNext()) {
			List<String> nextSPPU = itrSPPU.next();
			System.out.println("==============================================================================================================" + "\n"
			                    + nextSPPU
			               + "\n==============================================================================================================" 
			               + "\n----------------------------");
			Iterator<String> itr2SPPU = nextSPPU.iterator();
			while(itr2SPPU.hasNext()) {
				String next2SPPU = itr2SPPU.next();
				System.out.println(next2SPPU + "\n----------------------------");
			}
		}
		
		System.out.println("");
		System.out.println("-----------------------------");
		System.out.println("|>>> USING FOR EACH LOOP <<<|");
		System.out.println("-----------------------------");
		System.out.println("");
		
		for(List<String> forSPPU:SPPU) {
			for(String for2SPPU:forSPPU) {
				System.out.println(for2SPPU + "\n----------------------------");
			}
		}
	}
}
