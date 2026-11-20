package com.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.service.UserService;
import com.service.UserServiceImpl;

public class UserController {

	public static void main(String[] args) {

		System.out.println("============ USER MANAGEMENT SYSTEM ========");

		Scanner sc = new Scanner(System.in);

		UserService userService = new UserServiceImpl();

		boolean flag = true;

		while (flag) {
			try {
				System.out.println("=========== MENU ==========");
				System.out.println("1. Register User           ");
				System.out.println("2. Display All User Details");
				System.out.println("3. Update User Details     ");
				System.out.println("4. Delete User Details     ");
				System.out.println("5. Exit                    ");

				System.out.print("Enter Your Choice : ");
				int choice = sc.nextInt();

				switch (choice) {
				case 1:
					userService.registerUser();
					break;
				case 2:
					userService.displayAllUserDetails();
					break;
				case 3:
					userService.updateUserDetails();
					break;
				case 4:
					userService.deleteUserDetails();
					break;
				case 5:
					System.out.println("Thank You...!!");
					flag = false;
					break;
				default:
					System.out.println("Please Enter Valid Choice From Given Menu...!!");
				}

			} catch (InputMismatchException e) {
				System.out.println("INVALID INPUT..\nPLEASE RE-ENTER YOUR CHOICE..");
				sc.next();
				System.out.println(e);
			} catch (Exception e) {
				System.out.println("INVALID INPUT..\nPLEASE RE-ENTER YOUR CHOICE..");
				sc.next();
				System.out.println(e.getMessage());
			}

		}
	}

}
