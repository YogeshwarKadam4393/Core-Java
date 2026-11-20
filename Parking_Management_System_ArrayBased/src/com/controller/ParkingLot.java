package com.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.service.Vehicle;
import com.service.VehicleImple;

public class ParkingLot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Vehicle vehicle = new VehicleImple();

		boolean flag = true;
		
		
		try {
			
			while (flag) {

				System.out.println("\n==============================================");
				System.out.println("             PARKING LOT SYSTEM");
				System.out.println("==============================================  ");
				System.out.println("1. Add Vehicle                                  ");
				System.out.println("2. Display All Parked Vehicles                  ");
				System.out.println("3. Search Vehicle By Number                     ");
				System.out.println("4. Count Vehicle By Type                        ");
				System.out.println("5. Exit                                         ");
				System.out.println("==============================================  ");

				System.out.print("Enter Your Choice : ");
				int choice = sc.nextInt();
				sc.nextLine();

				switch (choice) {

				case 1:
					vehicle.addVehicle();
					break;

				case 2:
					vehicle.displayAllParkedVehicles();
					break;

				case 3:
					vehicle.searchForVehicleByVehicleNumber();
					break;

				case 4:
					vehicle.countVehicleByType();
					break;

				case 5:
					System.out.println("\nEXITED SUCCESSFULLY...!!");
					flag = false;
					break;
				default:
					System.out.println("\nInvalid Choice...!");
				}
			}
		} catch (InputMismatchException e) {

			System.out.println("\nPlease Enter Valid Input From Given Menu...!!");

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}
}