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

	boolean isAccCreated = true;

	long originalAccount = 0;

	@Override
	public void createAccount() {

		System.out.println();
		System.out.println("╔════════════════════════════════════════════════════════╗");
		System.out.println("║                                                        ║");
		System.out.println("║                   CREATE ACCOUNT                       ║");
		System.out.println("║                                                        ║");
		System.out.println("╠════════════════════════════════════════════════════════╣");
		System.out.println("║                                                        ║");
		System.out.println("║      ➤  Please Enter Account Details                  ║");
		System.out.println("║                                                        ║");
		System.out.println("║    01 ➤    Account Number                             ║");
		System.out.println("║    02 ➤    Account Holder Name                        ║");
		System.out.println("║    03 ➤    Phone Number                               ║");
		System.out.println("║    04 ➤    Email Id                                   ║");
		System.out.println("║    05 ➤    Aadhar Number                              ║");
		System.out.println("║    06 ➤    Pancard Number                             ║");
		System.out.println("║    07 ➤    Opening Balance                            ║");
		System.out.println("║    08 ➤    Account Holder Address                     ║");
		System.out.println("║                                                        ║");
		System.out.println("╠════════════════════════════════════════════════════════╣");
		System.out.println("║                 >>> ACCOUNT FORM <<<                   ║");
		System.out.println("╚════════════════════════════════════════════════════════╝");

		System.out.println();

		try {

			System.out.print("Enter Number Of Accounts You Want To Open : ");
			int num = sc.nextInt();

			if (num <= accounts.length) {

				for (int i = 0; i < num; i++) {

					Account account = new Account();

					System.out.print("\n  ➤ Enter First Name                    : ");
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
							}
						} else {
							System.out.println("  ◆ Invalid Balance...!");
						}
					} catch (Exception e) {
						System.out.println("  ◆ Invalid Balance...!");
					}

					System.out.print("\n  ➤ Enter Address                       : ");
					sc.nextLine();
					account.setAccountHolderAddress(sc.nextLine());

					originalAccount = account.generateAccountNumber();
					account.setAccountNo(originalAccount);

					System.out.println("\n  ➤ Your Account Number                : " + originalAccount);

					accounts[i] = account;

					System.out.println();

					System.out.println("╔════════════════════════════════════════════════════════╗");
					System.out.println("║                                                        ║");
					System.out.println("║               ACCOUNT CREATION COMPLETED               ║");
					System.out.println("║                                                        ║");
					System.out.println("╠════════════════════════════════════════════════════════╣");
					System.out.println("║                                                        ║");
					System.out.println("║           Bank Account Created Successfully!           ║");
					System.out.println("║                                                        ║");
					System.out.println("║          Account Details Saved Successfully !          ║");
					System.out.println("║                                                        ║");
					System.out.println("║                 ─── Thank You! ───                     ║");
					System.out.println("║                                                        ║");
					System.out.println("╚════════════════════════════════════════════════════════╝");

					System.out.println();

					System.out.println(
							"\n-------------------------------------------------------------------------------------------------\n");

					isAccCreated = false;

				}
			} else {
				System.out.println("Account Creation Limit Exceeds...!!");
			}

		} catch (InputMismatchException e) {

			System.out.println("\n  ◆ Invalid Input :  Please Enter Numbers Only...!!");

			sc.nextLine();
		} catch (Exception e) {
			System.out.println("\n  ◆ Invalid Input : " + e);
			sc.nextLine();
		}

	}

	@Override
	public void displayAccountDetails() {

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
			System.out.println("║    01 ➤    Account Number                             ║");
			System.out.println("║    02 ➤    Account Holder Name                        ║");
			System.out.println("║    03 ➤    Phone Number                               ║");
			System.out.println("║    04 ➤    Email Id                                   ║");
			System.out.println("║    05 ➤    Aadhar Number                              ║");
			System.out.println("║    06 ➤    Pancard Number                             ║");
			System.out.println("║    07 ➤    Opening Balance                            ║");
			System.out.println("║    08 ➤    Account Holder Address                     ║");
			System.out.println("║                                                        ║");
			System.out.println("╠════════════════════════════════════════════════════════╣");
			System.out.println("║                >>> ACCOUNT RECORD <<<                  ║");
			System.out.println("╚════════════════════════════════════════════════════════╝");

			System.out.println();

			System.out.print("  ➤ Enter Your Account Number : ");
			long accNo = sc.nextLong();

			System.out.println(
					"\n-------------------------------------------------------------------------------------------------");

			Account foundAccount = null;

			for (int i = 0; i < accounts.length; i++) {

				if (accounts[i] != null && accounts[i].getAccountNo() == accNo) {

					foundAccount = accounts[i];

					break;
				}
			}

			if (foundAccount != null) {

				System.out.println("\n  ➤ ACCOUNT DETAILS STARTED --->\n");

				System.out.println(foundAccount);

				System.out.println();

				System.out.println("╔════════════════════════════════════════════════════════╗");
				System.out.println("║                                                        ║");
				System.out.println("║             DISPLAY DETAILS COMPLETED                  ║");
				System.out.println("║                                                        ║");
				System.out.println("╚════════════════════════════════════════════════════════╝");

				System.out.println(
						"\n-------------------------------------------------------------------------------------------------\n");

			} else {

				System.out.println("  ➤ Please Enter Valid Account Number...");
			}

		} catch (InputMismatchException e) {

			System.out.println("\n  ◆ Invalid Input : Please Enter Valid Account Number...");

			sc.nextLine();

		} catch (Exception e) {

			System.out.println("\n  ◆ Invalid Input : Please Enter Valid Account Number...");
		}

	}

	@Override
	public void checkBalance() {

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
			System.out.println("║    01  ➤    Account Number                            ║");
			System.out.println("║    02  ➤    Available Balance                         ║");
			System.out.println("║                                                        ║");
			System.out.println("╠════════════════════════════════════════════════════════╣");
			System.out.println("║                 >>> BALANCE CHECK <<<                  ║");
			System.out.println("╚════════════════════════════════════════════════════════╝");

			System.out.println();

			System.out.print("  ➤ Enter Your Account Number : ");

			long accNo = sc.nextLong();

			System.out.println();

			boolean found = false;

			for (int i = 0; i < accounts.length; i++) {

				if (accounts[i] != null && accounts[i].getAccountNo() == accNo) {

					System.out.println("  ➤ Your Account Balance : ₹" + accounts[i].getBalance());

					System.out.println();

					System.out.println("╔════════════════════════════════════════════════════════╗");
					System.out.println("║                                                        ║");
					System.out.println("║              BALANCE CHECK COMPLETED                   ║");
					System.out.println("║                                                        ║");
					System.out.println("║             Your Balance Is Displayed                  ║");
					System.out.println("║                                                        ║");
					System.out.println("╚════════════════════════════════════════════════════════╝");
					System.out.println(

							"\n-------------------------------------------------------------------------------------------------\n");

					found = true;
					break;
				}
			}

			if (!found) {
				System.out.println("  ➤ Please Enter Valid Account Number...");
				checkBalance();
			}

		} catch (Exception e) {
			System.out.println("\n  ◆ Invalid Input : Please Enter Valid Account Number...");
		}
	}

	@Override
	public void depositAmount() {

		try {

			System.out.println();

			System.out.println();

			System.out.println("╔════════════════════════════════════════════════════════╗");
			System.out.println("║                                                        ║");
			System.out.println("║                   DEPOSIT AMOUNT                       ║");
			System.out.println("║                                                        ║");
			System.out.println("╠════════════════════════════════════════════════════════╣");
			System.out.println("║                                                        ║");
			System.out.println("║    Deposit Amount Process --->                         ║");
			System.out.println("║                                                        ║");
			System.out.println("║    01  ➤    Enter Account Number                      ║");
			System.out.println("║    02  ➤    Enter Deposit Amount                      ║");
			System.out.println("║    03  ➤    Display Updated Balance                   ║");
			System.out.println("║                                                        ║");
			System.out.println("╠════════════════════════════════════════════════════════╣");
			System.out.println("║              >>> DEPOSIT FORM <<<                      ║");
			System.out.println("╚════════════════════════════════════════════════════════╝");

			System.out.println();

			System.out.print("  ➤ Enter Your Account Number : ");

			long accNo = sc.nextLong();

			System.out.println();

			boolean found = false;

			for (int i = 0; i < accounts.length; i++) {

				if (accounts[i] != null && accounts[i].getAccountNo() == accNo) {

					System.out.print("\n  ➤ Enter Amount You Want To Deposit : ");

					double amt = sc.nextDouble();

					if (amt > 0) {

						double newBalance = accounts[i].getBalance() + amt;

						accounts[i].setBalance(newBalance);

						System.out.println();

						System.out.println("  ➤ Amount Deposited Successfully...");

						System.out.println("\n  ➤ Your Updated Balance is : ₹" + accounts[i].getBalance());

						System.out.println();

						System.out.println("╔════════════════════════════════════════════════════════╗");
						System.out.println("║                                                        ║");
						System.out.println("║               DEPOSIT AMOUNT COMPLETED                 ║");
						System.out.println("║                                                        ║");
						System.out.println("║                  ─── Thank You! ───                    ║");
						System.out.println("║                                                        ║");
						System.out.println("╚════════════════════════════════════════════════════════╝");

					} else {
						System.out.println("\n  ➤ Please Enter Valid Amount...");
					}

					found = true;
					break;
				}
			}

			if (!found) {
				System.out.println("  ➤ Please Enter Valid Account Number...");
			}

		} catch (Exception e) {
			System.out.println("\n  ◆ Invalid Input : Please Enter Valid Account Number...");
		}
	}

	@Override
	public void withdrawAmount() {

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
			System.out.println("║    01  ➤    Enter Account Number                      ║");
			System.out.println("║    02  ➤    Enter Withdraw Amount                     ║");
			System.out.println("║    03  ➤    Check Available Balance                   ║");
			System.out.println("║    04  ➤    Display Updated Balance                   ║");
			System.out.println("║                                                        ║");
			System.out.println("╠════════════════════════════════════════════════════════╣");
			System.out.println("║                 >>> WITHDRAW FORM <<<                  ║");
			System.out.println("╚════════════════════════════════════════════════════════╝");

			System.out.println();

			System.out.print("  ➤ Enter Your Account Number : ");
			long accNo = sc.nextLong();

			System.out.println();

			boolean found = false;

			for (int i = 0; i < accounts.length; i++) {

				if (accounts[i] != null && accounts[i].getAccountNo() == accNo) {

					System.out.print("\n  ➤ Enter Amount You Want To Withdraw : ");
					double withdrawAmount = sc.nextDouble();

					if (withdrawAmount <= 0) {
						System.out.println("\n  ➤ Please Enter Valid Amount...");

					} else if (withdrawAmount > accounts[i].getBalance()) {
						System.out.println("\n  ➤ Insufficient Balance...");
						System.out.println("  ➤ Your Available Balance is : ₹" + accounts[i].getBalance());

					} else {

						double updatedBalance = accounts[i].getBalance() - withdrawAmount;
						accounts[i].setBalance(updatedBalance);

						System.out.println();

						System.out.println("  ➤ Amount Withdrawn Successfully...");
						System.out.println("  ➤ Your Updated Balance is : ₹" + accounts[i].getBalance());

						System.out.println();

						System.out.println("╔════════════════════════════════════════════════════════╗");
						System.out.println("║                                                        ║");
						System.out.println("║              WITHDRAW AMOUNT COMPLETED                 ║");
						System.out.println("║                                                        ║");
						System.out.println("║                  ─── Thank You! ───                    ║");
						System.out.println("║                                                        ║");
						System.out.println("╚════════════════════════════════════════════════════════╝");

					}

					found = true;
					break;
				}
			}

			if (!found) {
				System.out.println();
				System.out.println("\n  ➤ Please Enter Valid Account Number...");
			}

			System.out.println(
					"\n-------------------------------------------------------------------------------------------------\n");

		} catch (Exception e) {
			System.out.println("\n  ◆ Invalid Input : Please Enter Valid Number...");
		}
	}

	@Override
	public void updateDetails() {

		while (flag) {

			try {

				System.out.println("");

				System.out.println("╔════════════════════════════════════════════════════════╗");
				System.out.println("║                                                        ║");
				System.out.println("║                 UPDATE DETAILS                         ║");
				System.out.println("║                                                        ║");
				System.out.println("║              ───── UPDATE MENU ─────                   ║");
				System.out.println("╠════════════════════════════════════════════════════════╣");
				System.out.println("║                                                        ║");
				System.out.println("║    01 ◆  Update Name                                   ║");
				System.out.println("║    02 ◆  Update Phone Number                           ║");
				System.out.println("║    03 ◆  Update Address                                ║");
				System.out.println("║    04 ◆  Update Aadhar Number                          ║");
				System.out.println("║    05 ◆  Update Pancard Number                         ║");
				System.out.println("║    06 ◆  Update Email                                  ║");
				System.out.println("║    07 ◆  Exit Update Process                           ║");
				System.out.println("║                                                        ║");
				System.out.println("╠════════════════════════════════════════════════════════╣");
				System.out.println("║              >>> SELECT YOUR OPTION <<<                ║");
				System.out.println("╚════════════════════════════════════════════════════════╝");

				System.out.print("\n ➤  Please Enter Your Choice : ");
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

					flag = false;
					break;
				default:

					System.out.println("\n---------------------------------------------------");
					System.out.println("              ✗ INVALID CHOICE");
					System.out.println("         Please Enter a Valid Choice...");
					System.out.println("---------------------------------------------------\n");

					break;
				}

			} catch (InputMismatchException e) {
				System.out.println("\n  ◆ Invalid Input... Please Enter Valid Data!");

			} catch (Exception e) {
				System.out.println("  ◆ Error : " + e.getMessage());
			}
		}
	}

	@Override
	public void updatePhoneNumber() {

		try {

			System.out.println("\n---------------------------------------------------");
			System.out.println("           UPDATE PHONE NUMBER PROCESS");
			System.out.println("---------------------------------------------------\n");

			System.out.print("➤  Enter Your Account Number           : ");
			long accNo = sc.nextLong();

			boolean found = false;

			for (int i = 0; i < accounts.length; i++) {

				if (accounts[i] != null && accounts[i].getAccountNo() == accNo) {

					System.out.print("\n➤  Enter Updated Phone Number           : ");
					String phnNo = ValidationChecker.getValidMobileno();

					accounts[i].setPhoneNo(phnNo);

					System.out.println("\n✓  Phone Number Updated Successfully...");

					System.out.println("---------------------------------------------------\n");

					found = true;
					break;
				}
			}

			if (!found) {
				System.out.println("\n  ➤ Please Enter Valid Account Number...");
			}

		} catch (Exception e) {
			System.out.println("\n  ◆ Invalid Input : " + e.getMessage());
		}
	}

	@Override
	public void updateName() {

		try {

			System.out.println("\n---------------------------------------------------");
			System.out.println("              UPDATE NAME PROCESS");
			System.out.println("---------------------------------------------------\n");

			System.out.print("\n  ➤ Enter Your Account Number       : ");
			long accNo = sc.nextLong();

			boolean found = false;

			for (int i = 0; i < accounts.length; i++) {

				if (accounts[i] != null && accounts[i].getAccountNo() == accNo) {

					System.out.print("\n  ➤ Enter First Name                 : ");
					String firstName = ValidationChecker.checkFirstName();

					accounts[i].setFirstName(firstName);

					System.out.print("\n  ➤ Enter Middle Name                : ");
					String middleName = ValidationChecker.checkMiddleName();

					accounts[i].setMiddleName(middleName);

					System.out.print("\n  ➤ Enter Last Name                  : ");
					String lastName = ValidationChecker.checkLastName();

					accounts[i].setLastName(lastName);

					System.out.println("\n✓  Name Updated Successfully...");
					System.out.println("---------------------------------------------------\n");

					found = true;

					break;
				}
			}

			if (!found) {

				System.out.println("\n  ➤ Please Enter Valid Account Number...");
				System.out.println("---------------------------------------------------\n");
			}

		} catch (Exception e) {

			System.out.println("\n  ◆ Invalid Input : " + e.getMessage());
		}
	}

	@Override
	public void updateAddress() {

		try {

			System.out.println("\n---------------------------------------------------");
			System.out.println("              UPDATE ADDRESS PROCESS");
			System.out.println("---------------------------------------------------\n");

			System.out.print("➤  Enter Your Account Number           : ");
			long accNo = sc.nextLong();

			boolean found = false;

			for (int i = 0; i < accounts.length; i++) {

				if (accounts[i] != null && accounts[i].getAccountNo() == accNo) {

					System.out.print("\n➤  Enter Updated Address           : ");
					sc.nextLine();
					String address = sc.nextLine();

					accounts[i].setAccountHolderAddress(address);

					System.out.println("\n✓  Address Updated Successfully...");

					System.out.println("---------------------------------------------------\n");

					found = true;
					break;
				}
			}

			if (!found) {
				System.out.println("\n  ➤ Please Enter Valid Account Number...");
			}

		} catch (Exception e) {
			System.out.println("\n  ◆ Invalid Input : " + e.getMessage());
		}

	}

	@Override
	public void updateAadharNumber() {

		try {

			System.out.println("\n---------------------------------------------------");
			System.out.println("           UPDATE AADHAR NUMBER PROCESS");
			System.out.println("---------------------------------------------------\n");

			System.out.print("➤  Enter Your Account Number           : ");
			long accNo = sc.nextLong();

			boolean found = false;

			for (int i = 0; i < accounts.length; i++) {

				if (accounts[i] != null && accounts[i].getAccountNo() == accNo) {

					System.out.print("\n➤  Enter Updated Aadhar Number           : ");
					String aadharNo = ValidationChecker.aadharValidation();

					accounts[i].setAddharNo(aadharNo);

					System.out.println("\n✓  Aadhar Number Updated Successfully...");

					System.out.println("---------------------------------------------------\n");

					found = true;
					break;
				}
			}

			if (!found) {
				System.out.println("\n  ➤ Please Enter Valid Account Number...");
			}

		} catch (Exception e) {
			System.out.println("\n  ◆ Invalid Input : " + e.getMessage());
		}
	}

	@Override
	public void updatePanNumber() {

		try {

			System.out.println("\n---------------------------------------------------");
			System.out.println("             UPDATE PAN NUMBER PROCESS");
			System.out.println("---------------------------------------------------\n");

			System.out.print("➤  Enter Your Account Number           : ");
			long accNo = sc.nextLong();

			boolean found = false;

			for (int i = 0; i < accounts.length; i++) {

				if (accounts[i] != null && accounts[i].getAccountNo() == accNo) {

					System.out.print("\n➤  Enter Updated PAN Number           : ");
					String panNo = ValidationChecker.checkValidPanNumber();

					accounts[i].setPanNo(panNo);

					System.out.println("\n✓  PAN Number Updated Successfully...");

					System.out.println("---------------------------------------------------\n");

					found = true;
					break;
				}
			}

			if (!found) {
				System.out.println("\n  ➤ Please Enter Valid Account Number...");
			}

		} catch (Exception e) {
			System.out.println("\n  ◆ Invalid Input : " + e.getMessage());
		}
	}

	@Override
	public void updateEmail() {

		try {

			System.out.println("\n---------------------------------------------------");
			System.out.println("              UPDATE EMAIL PROCESS");
			System.out.println("---------------------------------------------------\n");

			System.out.print("➤  Enter Your Account Number           : ");
			long accNo = sc.nextLong();

			boolean found = false;

			for (int i = 0; i < accounts.length; i++) {

				if (accounts[i] != null && accounts[i].getAccountNo() == accNo) {

					System.out.print("\n➤  Enter Updated Email Address           : ");
					String emailAddress = ValidationChecker.emailValidation();

					accounts[i].setEmailId(emailAddress);

					System.out.println("\n✓  Email Address Updated Successfully...");

					System.out.println("---------------------------------------------------\n");

					found = true;
					break;
				}
			}

			if (!found) {
				System.out.println("\n  ➤ Please Enter Valid Account Number...");
			}

		} catch (Exception e) {
			System.out.println("\n  ◆ Invalid Input : " + e.getMessage());
		}
	}

}