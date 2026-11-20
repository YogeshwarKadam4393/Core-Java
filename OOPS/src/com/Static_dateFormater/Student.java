package com.Static_dateFormater;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.text.DateFormatter;

public class Student {

	int rollNo;
	String name;
	String address;
	static final String collegeName = "COEP";

	static {
		System.out.println("Static Block");
	}

	public static void DateFormatter() throws ParseException {

		// 20260726 //YYYYMMDD
		// We Want in DD/MM/YYYY Format

		String inputDate = "2026/07/26";
		SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat outputFormat = new SimpleDateFormat("dd/MM/yyyy");

		// We have date in String Format, Now We need it in Date Format

		Date date = inputFormat.parse(inputDate);
		String outputDate = outputFormat.format(date);
		System.out.println("Original Date : " + inputDate);
		System.out.println("After Date    : " + outputDate);
	}

	public static void main(String[] args) throws ParseException {
		System.out.println("main Starts");
		
		System.out.println("College Name : "+collegeName);
		DateFormatter();
	}

}
