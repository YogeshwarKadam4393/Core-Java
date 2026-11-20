package com.service;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.allVehicles.AllVehicles;
import com.entity.VehicleProperties;
import com.validations.ValidationChecker;

public class VehicleImple implements Vehicle {

	static Scanner sc = new Scanner(System.in);

	static AllVehicles vehicles = new AllVehicles();

	static VehicleProperties[] vehicleProp = vehicles.addVehicles();

	static int count = 0;

	@Override
	public void addVehicle() {

		try {

			VehicleProperties vehicle = new VehicleProperties();

			long vehicleId = VehicleProperties.generateVehicleId();
			vehicle.setVehicleId(vehicleId);

			System.out.println("\nYour Vehicle Id is : " + vehicleId);

			System.out.print("Enter Vehicle Number : ");
			String vNo = ValidationChecker.getValidVehicleNumber();
			String vehicleNumber = vNo.toUpperCase();
			vehicle.setVehicleNumber(vehicleNumber);

			System.out.print("Enter First Name : ");
			String firstName = ValidationChecker.checkFirstName();
			vehicle.setFirstName(firstName);

			System.out.print("Enter Middle Name : ");
			String middleName = ValidationChecker.checkMiddleName();
			vehicle.setMiddleName(middleName);

			System.out.print("Enter Last Name : ");
			String lastName = ValidationChecker.checkLastName();
			vehicle.setLastName(lastName);

			System.out.print("Enter Vehicle Type : ");
			String vehicleType = sc.nextLine();
			vehicle.setVehicleType(vehicleType);

			vehicleProp[count] = vehicle;
			count++;

			System.out.println("\nVehicle Added Successfully...!");

		} catch (Exception e) {

			System.out.println("\nInvalid Input...!!");
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void displayAllParkedVehicles() {

		try {

			if (count == 0) {

				System.out.println("\nNo Vehicle Parked...!!");

			} else {

				System.out.println("\n----------- PARKED VEHICLES -----------");

				System.out.println("\n+------------+-----------------+--------------+--------------+--------------+-----------------------------+");
				System.out.println("| Vehicle ID    | Vehicle Number    | First Name     | Middle Name    | Last Name      | Vehicle Type       |");
				System.out.println("+------------+-----------------+--------------+--------------+--------------+-----------------------------+");

				for (int i = 0; i < count; i++) {

					System.out.println(vehicleProp[i]);
				}

				System.out.println("+---------------------------------------------------------------------------------------------------------+");
			}

		} catch (Exception e) {

			System.out.println("\nUnable to Display Vehicles...!!");
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void searchForVehicleByVehicleNumber() {

		try {

			System.out.print("Enter Vehicle Id : ");
			long vehicleId = sc.nextLong();

			sc.nextLine();

			System.out.print("Enter Vehicle Number : ");
			String vehicleNumber = sc.nextLine();

			boolean found = false;

			for (int i = 0; i < count; i++) {

				if ((vehicleProp[i].getVehicleId() == vehicleId)
						&& (vehicleProp[i].getVehicleNumber().equalsIgnoreCase(vehicleNumber))) {

					System.out.println("\nVehicle Found...!!");
					System.out.println(vehicleProp[i]);

					found = true;
					break;
				}
			}

			if (!found) {

				System.out.println("Vehicle Not Found...!!");
			}

		} catch (InputMismatchException e) {

			System.out.println("\nPlease Enter Valid Vehicle Id...!!");

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}

	@Override
	public void countVehicleByType() {

		try {

			System.out.print("Enter Vehicle Type : ");
			String type = sc.nextLine();

			int vehicleCount = 0;

			for (int i = 0; i < count; i++) {

				if (vehicleProp[i].getVehicleType().equalsIgnoreCase(type)) {

					vehicleCount++;
				}
			}

			System.out.println("\nTotal " + type + " Vehicles : " + vehicleCount);

		} catch (InputMismatchException e) {

			System.out.println("\nPlease Enter Valid Type Of Vehicle...!!");

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}
}