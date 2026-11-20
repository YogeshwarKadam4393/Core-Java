package com.service;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.array.ConstantArraySize;
import com.entity.Account;
import com.validations.ValidationChecker;

public class SBI implements RBI {

	Account[] accounts = new Account[ConstantArraySize.maxSize];

	static Scanner sc = new Scanner(System.in);

	boolean flag = true;

	boolean isLoggedIn = false;

	boolean isAccCreated = false;

	long originalAccount = 0;

	Account loggedInAccount = null;

	@Override
	public void createAccount() {

		if (isAccCreated) {

			System.out.println();
			System.out.println("Your Account has been Already Exist in SBI...");
			System.out.println("Please Choose Login Option.");

			return;
		}

		System.out.println();
		System.out.println("╔════════════════════════════════════════════════════════╗");
		System.out.println("║                                                        ║");
		System.out.println("║                   CREATE ACCOUNT                       ║");
		System.out.println("║                                                        ║");
		System.out.println("╠════════════════════════════════════════════════════════╣");
		System.out.println("║                                                        ║");
		System.out.println("║      ➤  Please Enter Account Details                   ║");
		System.out.println("║                                                        ║");
		System.out.println("║    01 ➤    Account Holder Name                        ║");
		System.out.println("║    02 ➤    Phone Number                               ║");
		System.out.println("║    03 ➤    Email Id                                   ║");
		System.out.println("║    04 ➤    Aadhar Number                              ║");
		System.out.println("║    05 ➤    Pancard Number                             ║");
		System.out.println("║    06 ➤    Opening Balance                            ║");
		System.out.println("║    07 ➤    Account Holder Address                     ║");
		System.out.println("║    08 ➤    Username                                   ║");
		System.out.println("║    09 ➤    Password                                   ║");
		System.out.println("║                                                        ║");
		System.out.println("╠════════════════════════════════════════════════════════╣");
		System.out.println("║                 >>> ACCOUNT FORM <<<                   ║");
		System.out.println("╚════════════════════════════════════════════════════════╝");

		System.out.println();

		try {

			System.out.print("Enter Number Of Accounts You Want To Open : ");
			int num = sc.nextInt();

			if (num <= 0) {
				System.out.println("\n◆ Please Enter Valid Number Of Accounts...");
				return;
			}

			if (num > accounts.length) {
				System.out.println("\n◆ Account Creation Limit Exceeds...!!");
				return;
			}

			for (int i = 0; i < num; i++) {

				Account account = new Account();

				System.out.println("\n===============================================");
				System.out.println("        ENTER ACCOUNT " + (i + 1) + " DETAILS");
				System.out.println("===============================================\n");

				System.out.print("  ➤ Enter First Name                    : ");
				String firstName = ValidationChecker.checkFirstName();
				account.setFirstName(firstName);

				System.out.print("\n  ➤ Enter Middle Name                   : ");
				String middleName = ValidationChecker.checkMiddleName();
				account.setMiddleName(middleName);

				System.out.print("\n  ➤ Enter Last Name                     : ");
				String lastName = ValidationChecker.checkLastName();
				account.setLastName(lastName);

				System.out.print("\n  ➤ Enter Phone Number                  : ");
				String phoneNumber = ValidationChecker.getValidMobileno();
				account.setPhoneNo(phoneNumber);

				System.out.print("\n  ➤ Enter Email Id                      : ");
				String emailId = ValidationChecker.emailValidation();
				account.setEmailId(emailId);

				System.out.print("\n  ➤ Enter Aadhar Number                 : ");
				String aadharNumber = ValidationChecker.aadharValidation();
				account.setAddharNo(aadharNumber);

				System.out.print("\n  ➤ Enter Pan Number                    : ");
				String pancardNumber = ValidationChecker.checkValidPanNumber();
				account.setPanNo(pancardNumber);

				try {

					System.out.print("\n  ➤ Enter Account Balance               : ");
					String balanceInput = sc.next();

					if (Pattern.matches("[0-9]+", balanceInput)) {
						double balance = Double.parseDouble(balanceInput);

						if (balance >= 2000) {
							account.setBalance(balance);
						} else {
							System.out.println("  ◆ MINIMUM BALANCE SHOULD BE           : 2000");
							return;
						}

					} else {
						System.out.println("  ◆ Invalid Balance...!");
						return;
					}

				} catch (Exception e) {
					System.out.println("  ◆ Invalid Balance...!");
					return;
				}

				System.out.print("\n  ➤ Enter Address                       : ");
				sc.nextLine();

				account.setAccountHolderAddress(sc.nextLine());

				// Generate account number
				originalAccount = account.generateAccountNumber();
				account.setAccountNo(originalAccount);
				System.out.println("\n  ➤ Your Account Number                : " + originalAccount);

				// Username and Password
				System.out.println("\nNow Set Username & Password For Your Account...");

				System.out.print("\n  ➤ Enter Username : ");
				String userName = sc.next();
				account.setUserName(userName);

				System.out.print("  ➤ Enter Password : ");
				String password = sc.next();
				account.setPassword(password);

				// Store account
				accounts[i] = account;

				System.out.println();

				System.out.println("╔════════════════════════════════════════════════════════╗");
				System.out.println("║                                                        ║");
				System.out.println("║               ACCOUNT CREATION COMPLETED              ║");
				System.out.println("║                                                        ║");
				System.out.println("║           Bank Account Created Successfully!          ║");
				System.out.println("║                                                        ║");
				System.out.println("║       Please Login To Access Your Account.             ║");
				System.out.println("║                                                        ║");
				System.out.println("║                 ─── Thank You! ───                     ║");
				System.out.println("║                                                        ║");
				System.out.println("╚════════════════════════════════════════════════════════╝");

				System.out.println();

				System.out.println(
						"\n-------------------------------------------------------------------------------------------------\n");
			}

			// Account created successfully
			isAccCreated = true;

			isLoggedIn = false;
			loggedInAccount = null;

		} catch (InputMismatchException e) {
			System.out.println("\n  ◆ Invalid Input : Please Enter Numbers Only...!!");
			sc.nextLine();

		} catch (Exception e) {
			System.out.println("\n  ◆ Invalid Input : " + e.getMessage());
			sc.nextLine();
		}
	}

	// =========================================================
	// LOGIN
	// =========================================================

	@Override
	public void login() {

		if (!isAccCreated) {
			System.out.println("\n  ◆ Please Create Your Account First...");
			return;
		}

		if (isLoggedIn) {
			System.out.println("\n  ◆ You Are Already Logged In...");
			return;
		}

		try {

			System.out.println();

			System.out.println("╔════════════════════════════════════════════════════════╗");
			System.out.println("║                       LOGIN                            ║");
			System.out.println("╠════════════════════════════════════════════════════════╣");
			System.out.println("║                                                        ║");
			System.out.println("║    01 ➤ Account Number                                 ║");
			System.out.println("║    02 ➤ Username                                      ║");
			System.out.println("║    03 ➤ Password                                      ║");
			System.out.println("║                                                        ║");
			System.out.println("╚════════════════════════════════════════════════════════╝");

			System.out.println();

			System.out.print("  ➤ Enter Account Number : ");
			long accNo = sc.nextLong();

			System.out.print("  ➤ Enter Username       : ");
			String userName = sc.next();

			System.out.print("  ➤ Enter Password       : ");
			String password = sc.next();

			boolean found = false;

			for (int i = 0; i < accounts.length; i++) {

				if (accounts[i] != null) {

					// Matching Account Number & Username and Password
					if ((accounts[i].getAccountNo() == accNo) && (accounts[i].getUserName().equals(userName)
							&& accounts[i].getPassword().equals(password))) {

						loggedInAccount = accounts[i];

						isLoggedIn = true;

						found = true;

						System.out.println();

						System.out.println("╔════════════════════════════════════════════════════════╗");
						System.out.println("║                                                        ║");
						System.out.println("║                  LOGIN SUCCESSFUL ✓                    ║");
						System.out.println("║                                                        ║");
						System.out.println("║              Welcome To SBI Banking                    ║");
						System.out.println("║                                                        ║");
						System.out.println("╚════════════════════════════════════════════════════════╝");

						System.out.println();
						break;
					}
				}
			}

			if (!found) {

				System.out.println();

				System.out.println("  ◆ Invalid Account Number / Username / Password...");
				System.out.println("  ◆ Please Enter Correct Login Details.");

				isLoggedIn = false;
				loggedInAccount = null;
			}

		} catch (InputMismatchException e) {

			System.out.println("\n  ◆ Invalid Account Number...");
			sc.nextLine();

		} catch (Exception e) {
			System.out.println("\n  ◆ Login Error : " + e.getMessage());
		}
	}

	// =========================================================
	// LOGOUT
	// =========================================================

	@Override
	public void logout() {

		if (!isLoggedIn) {

			System.out.println("\n  ◆ You Are Not Logged In...");
			return;
		}

		isLoggedIn = false;

		loggedInAccount = null;

		System.out.println("\n  ✓ Logout Successful...");

		System.out.println("  ➤ Thank You For Using SBI Banking Service.\n");
	}

	// =========================================================
	// DISPLAY ACCOUNT DETAILS
	// =========================================================

	@Override
	public void displayAccountDetails() {

		if (!isLoggedIn) {

			System.out.println("\n  ◆ Please Login First To Display Account Details...");
			return;
		}

		try {

			System.out.println();

			System.out.println("╔════════════════════════════════════════════════════════╗");
			System.out.println("║                                                        ║");
			System.out.println("║              DISPLAY ACCOUNT DETAILS                   ║");
			System.out.println("║                                                        ║");
			System.out.println("╠════════════════════════════════════════════════════════╣");
			System.out.println("║                                                        ║");
			System.out.println("║    Display Account Details --->                        ║");
			System.out.println("║                                                        ║");
			System.out.println("║    01 ➤ Account Number                                 ║");
			System.out.println("║    02 ➤ Account Holder Name                            ║");
			System.out.println("║    03 ➤ Phone Number                                   ║");
			System.out.println("║    04 ➤ Email Id                                       ║");
			System.out.println("║    05 ➤ Aadhar Number                                  ║");
			System.out.println("║    06 ➤ Pancard Number                                 ║");
			System.out.println("║    07 ➤ Opening Balance                                ║");
			System.out.println("║    08 ➤ Account Holder Address                         ║");
			System.out.println("║                                                        ║");
			System.out.println("╠════════════════════════════════════════════════════════╣");
			System.out.println("║                >>> ACCOUNT RECORD <<<                  ║");
			System.out.println("╚════════════════════════════════════════════════════════╝");

			System.out.println();

			System.out.println("  ➤ ACCOUNT DETAILS STARTED --->\n");

			System.out.println(loggedInAccount);

			System.out.println();

			System.out.println("╔════════════════════════════════════════════════════════╗");
			System.out.println("║                                                        ║");
			System.out.println("║             DISPLAY DETAILS COMPLETED                  ║");
			System.out.println("║                                                        ║");
			System.out.println("╚════════════════════════════════════════════════════════╝");

			System.out.println(
					"\n-------------------------------------------------------------------------------------------------\n");

		} catch (Exception e) {
			System.out.println("\n  ◆ Error : " + e.getMessage());
		}
	}

	// =========================================================
	// CHECK BALANCE
	// =========================================================

	@Override
	public void checkBalance() {

		if (!isLoggedIn) {
			System.out.println("\n  ◆ Please Login First To Check Balance...");
			return;
		}

		try {

			System.out.println();

			System.out.println("╔════════════════════════════════════════════════════════╗");
			System.out.println("║                                                        ║");
			System.out.println("║                    CHECK BALANCE                       ║");
			System.out.println("║                                                        ║");
			System.out.println("╠════════════════════════════════════════════════════════╣");
			System.out.println("║                                                        ║");
			System.out.println("║    Check Account Balance --->                          ║");
			System.out.println("║                                                        ║");
			System.out.println("║    01 ➤ Account Number                                 ║");
			System.out.println("║    02 ➤ Available Balance                              ║");
			System.out.println("║                                                        ║");
			System.out.println("╚════════════════════════════════════════════════════════╝");

			System.out.println();

			System.out.println("  ➤ Account Number : " + loggedInAccount.getAccountNo());
			System.out.println("  ➤ Your Account Balance : ₹" + loggedInAccount.getBalance());

			System.out.println();

			System.out.println("╔════════════════════════════════════════════════════════╗");
			System.out.println("║                                                        ║");
			System.out.println("║              BALANCE CHECK COMPLETED                   ║");
			System.out.println("║                                                        ║");
			System.out.println("║             Your Balance Is Displayed                  ║");
			System.out.println("║                                                        ║");
			System.out.println("╚════════════════════════════════════════════════════════╝");

		} catch (Exception e) {
			System.out.println("\n  ◆ Error : " + e.getMessage());
		}
	}

	// =========================================================
	// DEPOSIT
	// =========================================================

	@Override
	public void depositAmount() {

		if (!isLoggedIn) {
			System.out.println("\n  ◆ Please Login First To Deposit Amount...");
			return;
		}

		try {

			System.out.println();

			System.out.println("╔════════════════════════════════════════════════════════╗");
			System.out.println("║                                                        ║");
			System.out.println("║                   DEPOSIT AMOUNT                       ║");
			System.out.println("║                                                        ║");
			System.out.println("╠════════════════════════════════════════════════════════╣");
			System.out.println("║                                                        ║");
			System.out.println("║    Deposit Amount Process --->                         ║");
			System.out.println("║                                                        ║");
			System.out.println("║    01 ➤ Enter Deposit Amount                           ║");
			System.out.println("║    02 ➤ Display Updated Balance                        ║");
			System.out.println("║                                                        ║");
			System.out.println("╚════════════════════════════════════════════════════════╝");

			System.out.println();

			System.out.print("  ➤ Enter Amount You Want To Deposit : ");
			double amt = sc.nextDouble();

			if (amt <= 0) {
				System.out.println("\n  ➤ Please Enter Valid Amount...");
				return;
			}

			double newBalance = loggedInAccount.getBalance() + amt;
			loggedInAccount.setBalance(newBalance);

			System.out.println();

			System.out.println("  ➤ Amount Deposited Successfully...");
			System.out.println("  ➤ Your Updated Balance is : ₹" + loggedInAccount.getBalance());

			System.out.println();

			System.out.println("╔════════════════════════════════════════════════════════╗");
			System.out.println("║                                                        ║");
			System.out.println("║               DEPOSIT AMOUNT COMPLETED                 ║");
			System.out.println("║                                                        ║");
			System.out.println("║                  ─── Thank You! ───                    ║");
			System.out.println("║                                                        ║");
			System.out.println("╚════════════════════════════════════════════════════════╝");

		} catch (InputMismatchException e) {

			System.out.println("\n  ◆ Invalid Input : Please Enter Valid Amount...");
			sc.nextLine();

		} catch (Exception e) {
			System.out.println("\n  ◆ Error : " + e.getMessage());
		}
	}

	// =========================================================
	// WITHDRAW
	// =========================================================

	@Override
	public void withdrawAmount() {

		if (!isLoggedIn) {
			System.out.println("\n  ◆ Please Login First To Withdraw Amount...");
			return;
		}

		try {

			System.out.println();

			System.out.println("╔════════════════════════════════════════════════════════╗");
			System.out.println("║                                                        ║");
			System.out.println("║                    WITHDRAW AMOUNT                     ║");
			System.out.println("║                                                        ║");
			System.out.println("╠════════════════════════════════════════════════════════╣");
			System.out.println("║                                                        ║");
			System.out.println("║    Withdraw Amount Process --->                        ║");
			System.out.println("║                                                        ║");
			System.out.println("║    01 ➤ Enter Withdraw Amount                          ║");
			System.out.println("║    02 ➤ Check Available Balance                        ║");
			System.out.println("║    03 ➤ Display Updated Balance                        ║");
			System.out.println("║                                                        ║");
			System.out.println("╚════════════════════════════════════════════════════════╝");

			System.out.println();

			System.out.print("  ➤ Enter Amount You Want To Withdraw : ");
			double withdrawAmount = sc.nextDouble();

			if (withdrawAmount <= 0) {
				System.out.println("\n  ➤ Please Enter Valid Amount...");
				return;
			}

			if (withdrawAmount > loggedInAccount.getBalance()) {
				System.out.println("\n  ➤ Insufficient Balance...");
				System.out.println("  ➤ Your Available Balance is : ₹" + loggedInAccount.getBalance());
				return;
			}

			double updatedBalance = loggedInAccount.getBalance() - withdrawAmount;
			loggedInAccount.setBalance(updatedBalance);

			System.out.println();

			System.out.println("  ➤ Amount Withdrawn Successfully...");
			System.out.println("  ➤ Your Updated Balance is : ₹" + loggedInAccount.getBalance());

			System.out.println();

			System.out.println("╔════════════════════════════════════════════════════════╗");
			System.out.println("║                                                        ║");
			System.out.println("║              WITHDRAW AMOUNT COMPLETED                 ║");
			System.out.println("║                                                        ║");
			System.out.println("║                  ─── Thank You! ───                    ║");
			System.out.println("║                                                        ║");
			System.out.println("╚════════════════════════════════════════════════════════╝");

		} catch (InputMismatchException e) {

			System.out.println("\n  ◆ Invalid Input : Please Enter Valid Amount...");
			sc.nextLine();

		} catch (Exception e) {
			System.out.println("\n  ◆ Error : " + e.getMessage());
		}
	}

	// =========================================================
	// UPDATE DETAILS
	// =========================================================

	@Override
	public void updateDetails() {

		if (!isLoggedIn) {
			System.out.println("\n  ◆ Please Login First To Update Details...");
			return;
		}

		boolean updateFlag = true;

		while (updateFlag) {

			try {

				System.out.println();

				System.out.println("╔════════════════════════════════════════════════════════╗");
				System.out.println("║                                                        ║");
				System.out.println("║                 UPDATE DETAILS                         ║");
				System.out.println("║                                                        ║");
				System.out.println("║              ───── UPDATE MENU ─────                   ║");
				System.out.println("╠════════════════════════════════════════════════════════╣");
				System.out.println("║                                                        ║");
				System.out.println("║    01 ◆ Update Name                                    ║");
				System.out.println("║    02 ◆ Update Phone Number                            ║");
				System.out.println("║    03 ◆ Update Address                                 ║");
				System.out.println("║    04 ◆ Update Aadhar Number                           ║");
				System.out.println("║    05 ◆ Update Pancard Number                          ║");
				System.out.println("║    06 ◆ Update Email                                   ║");
				System.out.println("║    07 ◆ Exit Update Process                            ║");
				System.out.println("║                                                        ║");
				System.out.println("╚════════════════════════════════════════════════════════╝");

				System.out.print("\n ➤ Please Enter Your Choice : ");

				int ch = sc.nextInt();

				switch (ch) {

				case 1:
					updateName();
					break;

				case 2:
					updatePhoneNumber();
					break;

				case 3:
					updateAddress();
					break;

				case 4:
					updateAadharNumber();
					break;

				case 5:
					updatePanNumber();
					break;

				case 6:
					updateEmail();
					break;

				case 7:

					System.out.println("\n---------------------------------------------------");
					System.out.println("           UPDATE PROCESS COMPLETED ✓");
					System.out.println("---------------------------------------------------\n");

					updateFlag = false;
					break;

				default:
					System.out.println("\n  ◆ Invalid Choice...");
					break;
				}

			} catch (InputMismatchException e) {

				System.out.println("\n  ◆ Invalid Input... Please Enter Valid Data!");
				sc.nextLine();

			} catch (Exception e) {
				System.out.println("  ◆ Error : " + e.getMessage());
			}
		}
	}

	// =========================================================
	// UPDATE PHONE NUMBER
	// =========================================================

	@Override
	public void updatePhoneNumber() {

		if (!isLoggedIn) {
			System.out.println("\n  ◆ Please Login First...");
			return;
		}

		try {

			System.out.println("\n---------------------------------------------------");
			System.out.println("           UPDATE PHONE NUMBER PROCESS");
			System.out.println("---------------------------------------------------\n");

			System.out.print("➤ Enter Updated Phone Number : ");
			String phnNo = ValidationChecker.getValidMobileno();
			loggedInAccount.setPhoneNo(phnNo);

			System.out.println("\n✓ Phone Number Updated Successfully...");

			System.out.println("---------------------------------------------------\n");

		} catch (Exception e) {
			System.out.println("\n  ◆ Invalid Input : " + e.getMessage());
		}
	}

	// =========================================================
	// UPDATE NAME
	// =========================================================

	@Override
	public void updateName() {

		if (!isLoggedIn) {
			System.out.println("\n  ◆ Please Login First...");
			return;
		}

		try {

			System.out.println("\n---------------------------------------------------");
			System.out.println("              UPDATE NAME PROCESS");
			System.out.println("---------------------------------------------------\n");

			System.out.print("  ➤ Enter First Name  : ");
			String firstName = ValidationChecker.checkFirstName();
			loggedInAccount.setFirstName(firstName);

			System.out.print("\n  ➤ Enter Middle Name : ");
			String middleName = ValidationChecker.checkMiddleName();
			loggedInAccount.setMiddleName(middleName);

			System.out.print("\n  ➤ Enter Last Name   : ");
			String lastName = ValidationChecker.checkLastName();
			loggedInAccount.setLastName(lastName);

			System.out.println("\n✓ Name Updated Successfully...");

			System.out.println("---------------------------------------------------\n");

		} catch (Exception e) {
			System.out.println("\n  ◆ Invalid Input : " + e.getMessage());
		}
	}

	// =========================================================
	// UPDATE ADDRESS
	// =========================================================

	@Override
	public void updateAddress() {

		if (!isLoggedIn) {
			System.out.println("\n  ◆ Please Login First...");
			return;
		}

		try {

			System.out.println("\n---------------------------------------------------");
			System.out.println("              UPDATE ADDRESS PROCESS");
			System.out.println("---------------------------------------------------\n");

			System.out.print("➤ Enter Updated Address : ");
			sc.nextLine();
			String address = sc.nextLine();
			loggedInAccount.setAccountHolderAddress(address);

			System.out.println("\n✓ Address Updated Successfully...");

			System.out.println("---------------------------------------------------\n");

		} catch (Exception e) {
			System.out.println("\n  ◆ Invalid Input : " + e.getMessage());
		}
	}

	// =========================================================
	// UPDATE AADHAR
	// =========================================================

	@Override
	public void updateAadharNumber() {

		if (!isLoggedIn) {
			System.out.println("\n  ◆ Please Login First...");
			return;
		}

		try {

			System.out.println("\n---------------------------------------------------");
			System.out.println("           UPDATE AADHAR NUMBER PROCESS");
			System.out.println("---------------------------------------------------\n");

			System.out.print("➤ Enter Updated Aadhar Number : ");
			String aadharNo = ValidationChecker.aadharValidation();
			loggedInAccount.setAddharNo(aadharNo);

			System.out.println("\n✓ Aadhar Number Updated Successfully...");

			System.out.println("---------------------------------------------------\n");

		} catch (Exception e) {
			System.out.println("\n  ◆ Invalid Input : " + e.getMessage());
		}
	}

	// =========================================================
	// UPDATE PAN
	// =========================================================

	@Override
	public void updatePanNumber() {

		if (!isLoggedIn) {
			System.out.println("\n  ◆ Please Login First...");
			return;
		}

		try {

			System.out.println("\n---------------------------------------------------");
			System.out.println("             UPDATE PAN NUMBER PROCESS");
			System.out.println("---------------------------------------------------\n");

			System.out.print("➤ Enter Updated PAN Number : ");
			String panNo = ValidationChecker.checkValidPanNumber();
			loggedInAccount.setPanNo(panNo);

			System.out.println("\n✓ PAN Number Updated Successfully...");

			System.out.println("---------------------------------------------------\n");

		} catch (Exception e) {
			System.out.println("\n  ◆ Invalid Input : " + e.getMessage());
		}
	}

	// =========================================================
	// UPDATE EMAIL
	// =========================================================

	@Override
	public void updateEmail() {

		if (!isLoggedIn) {
			System.out.println("\n  ◆ Please Login First...");
			return;
		}

		try {

			System.out.println("\n---------------------------------------------------");
			System.out.println("              UPDATE EMAIL PROCESS");
			System.out.println("---------------------------------------------------\n");

			System.out.print("➤ Enter Updated Email Address : ");
			String emailAddress = ValidationChecker.emailValidation();
			loggedInAccount.setEmailId(emailAddress);

			System.out.println("\n✓ Email Address Updated Successfully...");

			System.out.println("---------------------------------------------------\n");

		} catch (Exception e) {
			System.out.println("\n  ◆ Invalid Input : " + e.getMessage());
		}
	}

}