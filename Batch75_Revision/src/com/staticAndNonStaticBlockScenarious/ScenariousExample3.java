package com.staticAndNonStaticBlockScenarious;

public class ScenariousExample3 {
	
	static {
		System.out.println("111");
		ScenariousExample3 s2 = new ScenariousExample3();
	}
	
	public ScenariousExample3() {
		System.out.println("222");
	}
	
	{
		System.out.println("333");
	}
	
	{
		System.out.println("333");
		
		// Here StackOverFlow Error Will Come 
		ScenariousExample3 s3 = new ScenariousExample3();
	}
	
	public static void main(String[] args) {
		
		System.out.println("444");
		
		ScenariousExample3 s = new ScenariousExample3();
	}

}
