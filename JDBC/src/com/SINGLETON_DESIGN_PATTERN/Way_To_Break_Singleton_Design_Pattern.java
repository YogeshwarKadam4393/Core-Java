package com.SINGLETON_DESIGN_PATTERN;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;

public class Way_To_Break_Singleton_Design_Pattern {
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Connection originalSingletonInstance = MyConnection.getConnection();
		Connection duplicateSingletonInstance = MyConnection.getConnection();
		
		System.out.println("ORIGINAL SINGLETON HASHCODE : " + originalSingletonInstance.hashCode());
		System.out.println("DUPLICATE SINGLETON HASHCODE : " + duplicateSingletonInstance.hashCode());
		
		
		// 1. REFLECTION API
		
		Class<?> singletonClass =  Class.forName("com.SINGLETON_DESIGN_PATTERN.MyConnection");
		Constructor<MyConnection> constructor = (Constructor<MyConnection>) singletonClass.getDeclaredConstructor();
		constructor.setAccessible(true);
		
		MyConnection newInstance = constructor.newInstance();
		
		System.out.println("ORIGINAL SINGLETON HASHCODE : " + originalSingletonInstance.hashCode());
		System.out.println("DUPLICATE SINGLETON HASHCODE : " + newInstance.hashCode());

		
	}

}
