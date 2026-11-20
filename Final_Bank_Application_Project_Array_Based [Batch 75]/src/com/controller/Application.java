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
			System.out.println("║    02 ◆  Login                                        ║");
			System.out.println("║    03 ◆  Display Account Details                      ║");
			System.out.println("║    04 ◆  Check Balance                                ║");
			System.out.println("║    05 ◆  Deposit Amount                               ║");
			System.out.println("║    06 ◆  Withdraw Amount                              ║");
			System.out.println("║    07 ◆  Update Account Details                       ║");
			System.out.println("║    08 ◆  Logout                                       ║");
			System.out.println("║    09 ◆  Exit                                         ║");
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
					rbi.login();
					break;

				case 3:
					rbi.displayAccountDetails();
					break;

				case 4:
					rbi.checkBalance();
					break;

				case 5:
					rbi.depositAmount();
					break;

				case 6:
					rbi.withdrawAmount();
					break;

				case 7:
					rbi.updateDetails();
					break;

				case 8:
					rbi.logout();
					break;

				case 9:

					System.out.println();
					System.out.println("---------------------------------------------------");
					System.out.println("          BANK APPLICATION EXITED ✓");
					System.out.println("             Thank You For Banking!");
					System.out.println("---------------------------------------------------");
					System.out.println();

					flag = false;

					break;

				default:

					System.out.println();
					System.out.println("---------------------------------------------------");
					System.out.println("              ✗ INVALID CHOICE");
					System.out.println("       Please Enter a Valid Choice...");
					System.out.println("---------------------------------------------------");
					System.out.println();

					break;
				}

			} catch (InputMismatchException e) {

				System.out.println("\n◆ PLEASE ENTER NUMBERS ONLY...!!");
				sc.nextLine();

			} catch (Exception e) {
				
				System.out.println("\n◆ Error : " + e.getMessage());
				sc.nextLine();
			}
		}

	}

}