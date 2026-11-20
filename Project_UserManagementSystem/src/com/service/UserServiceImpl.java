package com.service;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.customExceptions.InvalidChoiceException;
import com.model.User;
import com.validations.ValidationChecker;

public class UserServiceImpl implements UserService {

	User[] users = new User[5];

	@Override
	public void registerUser() {

		System.out.println(
				"\n==========================================================================================");
		System.out.println(
				">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Register User Process Started <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println(
				"==========================================================================================\n");

		try {

			Scanner input = new Scanner(System.in);

			System.out.print("Enter how many user you want to register: ");
			int number = input.nextInt();

			if (number <= users.length) {

				for (int i = 0; i < number; i++) {

					User user = new User();

					try {
						System.out.print("\nEnter userId: ");
						int userId = input.nextInt();
						user.setUserId(userId);
					} catch (InputMismatchException e) {
						System.out.println("PLEASE ENTER NUMBER ONLY...!!");
						e.printStackTrace();
						input.next();
						System.out.print("\nEnter userId: ");
						int userId = input.nextInt();
						user.setUserId(userId);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}

					System.out.print("\nEnter UserName: ");
					String userName = input.next();
					user.setUserName(userName);

					System.out.print("\nEnter Password: ");
					String password = input.next();
					user.setPassword(password);

					System.out.print("\nEnter address: ");
					String address = input.next();
					user.setAddress(address);

					try {
						String pancardNumber = ValidationChecker.checkValidPanNumber();
						user.setPancardNumber(pancardNumber);
						
					} catch (InputMismatchException e) {
						System.out.println(e.getMessage());
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}

					try {
						String aadharNumber = ValidationChecker.aadharValidation();
						user.setAadharNumber(aadharNumber);

					} catch (InputMismatchException e) {
						System.out.println(e.getMessage());
						e.printStackTrace();
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}

					try {
						long mobileNo = ValidationChecker.getValidMobileno();
						user.setMobileNumber(mobileNo);
						
					} catch (InputMismatchException e) {
						System.out.println(e.getMessage());
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}

					users[i] = user;

					System.out.println(
							"\n--------------------------------------------------------------------------------------------------------------------------");
					System.out.println("Thank You...\nUser Has Been Successfully Registered");

					System.out.println(
							"\n==========================================================================================");
					System.out.println(
							">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Register User Process Closed <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
					System.out.println(
							"==========================================================================================\n");
				}
				System.out.println("All User Added Successfully");
			} else {
				System.out.println("Limit Exceeds... You Cannot Register More Users.");
				;
			}

		} catch (InputMismatchException e) {
			throw new InvalidChoiceException("Invalid Input... Please Enter Valid Input");
		}

	}

	@Override
	public void displayAllUserDetails() {

		System.out.println(
				"\n==========================================================================================");
		System.out.println(
				">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Display User Details Process Started <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println(
				"==========================================================================================\n");

		for (User userObj : users) {
			if (userObj != null) {
				System.out.println(userObj);
			}
		}

		System.out.println(
				"\n==========================================================================================");
		System.out.println(
				">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Display User Details Process Closed <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println(
				"==========================================================================================\n");

	}

	@Override
	public void updateUserDetails() throws InvalidChoiceException {

		System.out.println(
				"\n==========================================================================================");
		System.out.println(
				">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Update Profile Process Started <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println(
				"==========================================================================================\n");

		Scanner input = new Scanner(System.in);

		try {
			try {
				System.out.println("Enter your User Id: ");
				int userId = input.nextInt();
			} catch (InputMismatchException e) {
				throw new InvalidChoiceException("Invalid Choice...Please Enter Valid Choice...");
			}

			int userId = 0;

			User foundUser = null;

			// Find user by userId
			for (int i = 0; i < users.length; i++) {
				if (users[i] != null && users[i].getUserId() == userId) {
					foundUser = users[i];
					break;
				}
			}

			if (foundUser == null) {
				System.out.println("User Not Found...");
				return;
			}

			String ch = isCorrectChoice();

			switch (ch) {

			case "1":
				try {
					System.out.println("Please enter New UserName :");
					String userName = input.next();
					foundUser.setUserName(userName);
					System.out.println("UserName Updated Successfully...!");
					break;

				} catch (InputMismatchException e) {
					throw new InvalidChoiceException("Please Enter Valid Input...");
				} catch (Exception e) {
					throw new InvalidChoiceException("Please Enter Valid Input...");
				}

			case "2":
				try {
					System.out.println("Please enter New Password :");
					String password = input.next();
					foundUser.setPassword(password);
					System.out.println("Password Updated Successfully...!");
					break;

				} catch (InputMismatchException e) {
					throw new InvalidChoiceException("Please Enter Valid Input...");
				} catch (Exception e) {
					throw new InvalidChoiceException("Please Enter Valid Input...");
				}

			case "3":
				try {
					System.out.println("Please enter Updated Address:");
					String newAddress = input.next();
					foundUser.setAddress(newAddress);
					System.out.println("Address Updated Successfully...!");
					break;

				} catch (InputMismatchException e) {
					throw new InvalidChoiceException("Please Enter Valid Input...");
				} catch (Exception e) {
					throw new InvalidChoiceException("Please Enter Valid Input...");
				}

			case "4":
				try {
					System.out.println("Please enter New Mobile Number:");
					long mobileNumber = input.nextLong();
					foundUser.setMobileNumber(mobileNumber);
					System.out.println("Mobile Number Updated Successfully...!");
					break;

				} catch (InputMismatchException e) {
					throw new InvalidChoiceException("Please Enter Valid Input...");
				} catch (Exception e) {
					throw new InvalidChoiceException("Please Enter Valid Input...");
				}

			case "5":
				System.out.println("Thank You...!!");
				return;

			default:
				System.out.println("Invalid choice. Please try again...!");
				updateUserDetails();
				break;
			}
		} catch (InputMismatchException e) {
			throw new InvalidChoiceException("Invalid Input...Please Enter Valid Input");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@Override
	public void deleteUserDetails() {

		System.out.println(
				"\n==========================================================================================");
		System.out.println(
				">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Delete User Details Process Started <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println(
				"==========================================================================================\n");

		Scanner input = new Scanner(System.in);

		try {
			System.out.print("Enter User Id: ");
			int userId = input.nextInt();

			for (int i = 0; i < users.length; i++) {
				if (users[i] != null && userId == users[i].getUserId()) {
					users[i] = null;
				}
			}
			System.out.println("\nUser Deleted Successfully...");

		} catch (InputMismatchException e) {
			throw new InvalidChoiceException("Please Enter Valid Choice...");
		} catch (Exception e) {
			throw new InvalidChoiceException("Please Enter Valid Choice...");
		}

		System.out.println(
				"\n==========================================================================================");
		System.out.println(
				">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Delete User Details Process Closed <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println(
				"==========================================================================================\n");
	}

	private String isCorrectChoice() throws InvalidChoiceException {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("\n\n***** UPDATE PROFILE MENU *****");
			System.out.println("     1 -> UserName      |");
			System.out.println("     2 -> Password      |");
			System.out.println("     3 -> Address       |");
			System.out.println("     4 -> Mobile Number |");
			System.out.println("     5 -> Exit          |");
			System.out.println("----------------------------");

			System.out.println("\nEnter Your Choice :");
			String choice = sc.next();

			if (choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4")
					|| choice.equals("5")) {
				return choice;
			} else {
				System.out.println("\nInvalid Choice...\nPlease try again...!");
				return choice;
			}

		} catch (InputMismatchException e) {
			throw new InvalidChoiceException("Please Enter Valid Choice...");
		} catch (Exception e) {
			throw new InvalidChoiceException("Please Enter Valid Choice...");
		}

	}
}
