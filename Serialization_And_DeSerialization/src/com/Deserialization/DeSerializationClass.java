package com.Deserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.entity.Student;

public class DeSerializationClass {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fileInputStream = new FileInputStream("student.txt");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		
		Student student = (Student) objectInputStream.readObject();
		System.out.println(student);
		
	}

}
