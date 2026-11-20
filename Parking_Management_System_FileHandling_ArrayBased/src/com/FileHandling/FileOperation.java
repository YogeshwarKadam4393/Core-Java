    package com.FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.entity.VehicleProperties;

public class FileOperation {

	public static void saveVehicles(VehicleProperties vehicleProp) throws IOException {

		FileWriter fileWriter = new FileWriter("ParkingLot_Application.txt", true);  // FileWriter is a java class which is used to write character data into file
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); // true means open the file and add new data at the ending of existing data
		// bufferWriter uses buffer in memory before writing data into file. It Provides Efficient writing and usefull methods such as :
		// 1. write()  2. newLine() --> for moving the cursor to next Line
		bufferedWriter.write(
				vehicleProp.getVehicleId() + ","
				+ vehicleProp.getFirstName() + ","
			    + vehicleProp.getMiddleName() + ","
				+ vehicleProp.getLastName() + ","
				+ vehicleProp.getVehicleNumber() + ","
				+ vehicleProp.getVehicleType());

		bufferedWriter.newLine();
		bufferedWriter.close();

		System.out.println("Vehicle Saved Successfully");
	}

	public static void showAllVehicles() throws IOException {

		FileReader fileReader = new FileReader("ParkingLot_Application.txt"); 
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		String data;

		System.out.println("\n==============================");
		System.out.println("       ALL VEHICLE DATA       ");
		System.out.println("==============================");

		while ((data = bufferedReader.readLine()) != null) {

			System.out.println(data);
		}

		bufferedReader.close();
	}

	public static void showFileInformation() throws IOException {

		File file = new File("ParkingLot_Application.txt");

		if (file.exists()) {

			System.out.println("==============================");
			System.out.println("       FILE INFORMATION       ");
			System.out.println("==============================");

			System.out.println("File Name: " + file.getName());
			System.out.println("File Path: " + file.getAbsolutePath());
			System.out.println("File Size: " + file.length() + " bytes");
			System.out.println("Can Read: "  + file.canRead());
			System.out.println("Can Write: " + file.canWrite());

		} else {

			System.out.println("ParkingLot_Application.txt does not exist.");
		}
	}

	public static void backupFile() throws IOException {

		FileInputStream fis = new FileInputStream("ParkingLot_Application.txt");
		// Is Used for Reading the data from the file as Byte.
		FileOutputStream fos = new FileOutputStream("ParkingLot_Application_backup.txt");
		// It is used for Writing Bytes . If the backup file does not exist , Java Creates it
		int data;

		while ((data = fis.read()) != -1) {

			fos.write(data);
		}

		fis.close();
		fos.close();

		System.out.println("Backup Created Successfully.");
	}

	public static void deleteFile() throws IOException {

		File file = new File("ParkingLot_Application_backup.txt");

		if (file.exists()) {

			if (file.delete()) {

				System.out.println("File deleted successfully");

			} else {

				System.out.println("Unable to delete the file");
			}

		} else {

			System.out.println("File Does not exist");
		}
	}
}