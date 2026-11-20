package com.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.service.RBI;
import com.service.SBI;

public class Application {

	static RBI rbi = new SBI();

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("======================================================================");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>> BANK APPLICATION <<<<<<<<<<<<<<<<<<<<<<<<<<<<|");
		System.out.println("======================================================================\n");

		boolean flag = true;

		while (flag) {

			System.out.println();
			System.out.println("╔════════════════════════════════════════════════════════╗");
			System.out.println("║                                                        ║");
			System.out.println("║                  BANK APPLICATION                      ║");
			System.out.println("║                                                        ║");
			System.out.println("║               ─────── MAIN MENU ───────                ║");
			System.out.println("╠════════════════════════════════════════════════════════╣");
			System.out.println("║                                                        ║");
			System.out.println("║    01 ◆  Create Account                               ║");
			System.out.println("║    02 ◆  Display Account Details                      ║");
			System.out.println("║    03 ◆  Check Balance                                ║");
			System.out.println("║    04 ◆  Deposit Amount                               ║");
			System.out.println("║    05 ◆  Withdraw Amount                              ║");
			System.out.println("║    06 ◆  Update Account Details                       ║");
			System.out.println("║    07 ◆  Exit                                         ║");
			System.out.println("║                                                        ║");
			System.out.println("╠════════════════════════════════════════════════════════╣");
			System.out.println("║              >>> SELECT YOUR OPTION <<<                ║");
			System.out.println("╚════════════════════════════════════════════════════════╝");

			try {

				System.out.print("\n ➤  Please Enter Your Choice : ");
				int ch = sc.nextInt();

				System.out.println(
						"\n--------------------------------------------------------------------------------------------------\n");

				switch (ch) {

				case 1:
					rbi.createAccount();
					break;

				case 2:
					rbi.displayAccountDetails();
					break;

				case 3:
					rbi.checkBalance();
					break;

				case 4:
					rbi.depositAmount();
					break;

				case 5:
					rbi.withdrawAmount();
					break;

				case 6:
					rbi.updateDetails();
					break;

				case 7:
					System.out.println("Exited Successfully...!");
					flag = false;
					break;

				default:
					System.out.println("Invalid Choice... Please Enter Valid Choice...!");

				}

			} catch (InputMismatchException e) {

				System.out.println("\n◆ PLEASE ENTER NUMBERS ONLY...!!");

			} catch (Exception e) {

				System.out.println(e.getMessage());
			}
		}

	}
}