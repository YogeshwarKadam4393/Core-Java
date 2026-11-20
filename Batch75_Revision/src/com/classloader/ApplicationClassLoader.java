package com.classloader;

import java.util.Scanner;

public class ApplicationClassLoader {
	
	public static void main(String[] args) {
		
//      Application ClassLoader ----> jdk.internal.loader.ClassLoaders$AppClassLoader@105be200
		System.out.println(ApplicationClassLoader.class.getClassLoader());
		
//      BootStrap ClassLoader is Written in Native language thats its Getting Null 		
		System.out.println(String.class.getClassLoader());
		
//      BootStrap ClassLoader is Written in Native language thats its Getting Null 		
		System.out.println(Scanner.class.getClassLoader());


		
		
	}

}
