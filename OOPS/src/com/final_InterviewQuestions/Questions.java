package com.final_InterviewQuestions;

// 1.Can we put value in global variable without initializing 
// ANS : Yes,We can put value by using Constructor just one time


public class Questions {
	
	final int i;
	
	public Questions() {  // Ans of Question 1

		i = 100;
		System.out.println(i);
	}
	
	public void m1(final int i,final int j) {
		
	//	i = 1000;   // After Puting local Variable it is not considering parametarized values 
	//	j = 2000;   // to overcome we can do final to parameters so the local variable value will not be considered
		
	    int k = i + j ;
		System.out.println(k);
	}
	
	public static void main(String[] args) {
		
		Questions q = new Questions();
		
		q.m1(12, 13);
	}

}
