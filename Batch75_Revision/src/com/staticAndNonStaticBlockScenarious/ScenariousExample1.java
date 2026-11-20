package com.staticAndNonStaticBlockScenarious;

public class ScenariousExample1 {
	
	static {
		System.out.println("111");
	}
	
	public ScenariousExample1() {
		System.out.println("222");
	}
	
	{
		System.out.println("333");
	}
	
	public static void main(String[] args) {
		
		System.out.println("444");
		
		ScenariousExample1 s = new ScenariousExample1();
	}

}
