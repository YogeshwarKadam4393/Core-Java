package com.staticAndNonStaticBlockScenarious;

public class ScenariousExample2 {
	
	static {
		System.out.println("111");
		ScenariousExample2 s2 = new ScenariousExample2();
	}
	
	public ScenariousExample2() {
		System.out.println("222");
	}
	
	{
		System.out.println("333");
	}
	
	public static void main(String[] args) {
		
		System.out.println("444");
		
		ScenariousExample2 s = new ScenariousExample2();
	}

}
