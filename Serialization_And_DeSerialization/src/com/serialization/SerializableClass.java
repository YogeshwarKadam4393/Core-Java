package com.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.entity.Student;

public class SerializableClass {
	
	public static void main(String[] args) throws IOException {
		
		Student s = new Student();
		s.setId(1);
		s.setName("Yogesh");
		
		FileOutputStream fileOutputStream = new FileOutputStream("student.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		
		objectOutputStream.writeObject(s);		

		System.out.println("STUDENT IS SERIALIZED SUCCESSFULLY...!!");
		
	}

}
