package com.service;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.entity.Account;
import com.validations.ValidationChecker;

public class SBI implements RBI {

	static Account account = new Account();

	static Scanner sc = new Scanner(System.in);

	static RBI rbi = new SBI();

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
			sc.nextLine();
			String aadharNumber = ValidationChecker.aadharValidation();
			account.setAddharNo(aadharNumber);

			System.out.print("\n  ➤ Enter Pan Number                    : ");
			String pancardNumber = ValidationChecker.checkValidPanNumber();
			account.setPanNo(pancardNumber);

			accountOpeningBalance();

			System.out.print("\n  ➤ Enter Address                       : ");
			sc.nextLine();
			account.setAccountHolderAddress(sc.nextLine());

			originalAccount = account.generateAccountNumber();  
			account.setAccountNo(originalAccount);

			System.out.println("\n  ➤ Your Account Number                : " + originalAccount);

		} catch (Exception e) {

			System.out.println("\n  ◆ Invalid Input : " + e.getMessage());
			sc.nextLine();
		}

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

			if (originalAccount == accNo) {

				System.out.println("\n  ➤ ACCOUNT DETAILS STARTED --->\n");

				System.out.println(account);
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

			if (originalAccount == accNo) {

				System.out.println("  ➤ Your Account Balance : ₹" + account.getBalance());

			} else {

				System.out.println("  ➤ Please Enter Valid Account Number...");
			}

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

		} catch (Exception e) {

			System.out.println("\n  ◆ Invalid Input : Please Enter Valid Account Number...");
		}
	}

	@Override
	public void depositAmount() {

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

			if (originalAccount == accNo) {

				System.out.print("\n  ➤ Enter Amount You Want To Deposit : ");
				double amt = sc.nextDouble();

				if (amt > 0) {

					double newBalance = account.getBalance() + amt;

					account.setBalance(newBalance);

					System.out.println();
					System.out.println("  ➤ Amount Deposited Successfully...");
					System.out.println("\n  ➤ Your Updated Balance is : ₹" + account.getBalance());

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

			} else {

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

			if (originalAccount == accNo) {

				System.out.print("\n  ➤ Enter Amount You Want To Withdraw : ");
				double withdrawAmount = sc.nextDouble();

				if (withdrawAmount <= 0) {

					System.out.println("\n  ➤ Please Enter Valid Amount...");

				} else if (withdrawAmount > account.getBalance()) {

					System.out.println("\n  ➤ Insufficient Balance...");
					System.out.println("  ➤ Your Available Balance is : ₹" + account.getBalance());

				} else {

					double updatedBalance = account.getBalance() - withdrawAmount;

					account.setBalance(updatedBalance);

					System.out.println();
					System.out.println("  ➤ Amount Withdrawn Successfully...");
					System.out.println("  ➤ Your Updated Balance is : ₹" + account.getBalance());

					System.out.println();

					System.out.println("╔════════════════════════════════════════════════════════╗");
					System.out.println("║                                                        ║");
					System.out.println("║              WITHDRAW AMOUNT COMPLETED                 ║");
					System.out.println("║                                                        ║");
					System.out.println("║                  ─── Thank You! ───                    ║");
					System.out.println("║                                                        ║");
					System.out.println("╚════════════════════════════════════════════════════════╝");
				}

			} else {

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
					rbi.updateName();
					break;

				case 2:
					rbi.updatePhoneNumber();
					break;

				case 3:
					rbi.updateAddress();
					break;

				case 4:
					rbi.updateAadharNumber();
					break;

				case 5:
					rbi.updatePanNumber();
					break;

				case 6:
					rbi.updateEmail();
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
				sc.nextLine();

			} catch (Exception e) {
				System.out.println("  ◆ Error : " + e.getMessage());
			}
		}
	}

	public static void accountOpeningBalance() {

		try {

			System.out.print("\n  ➤ Enter Account Balance               : ");

			String balanceInput = sc.next();

			if (Pattern.matches("[0-9]+", balanceInput)) {

				double balance = Double.parseDouble(balanceInput);

				if (balance >= 2000) {

					account.setBalance(balance);

				} else {

					System.out.println("  ◆ MINIMUM BALANCE SHOULD BE           : 2000");

					accountOpeningBalance();
				}

			} else {

				System.out.println("  ◆ Invalid Balance...!");

				accountOpeningBalance();
			}

		} catch (Exception e) {

			System.out.println("  ◆ Invalid Balance...!");

			accountOpeningBalance();
		}
	}

	@Override
	public void updateName() {

		try {

			System.out.println("\n---------------------------------------------------");
			System.out.println("              UPDATE NAME PROCESS");
			System.out.println("---------------------------------------------------\n");

			System.out.print("\n  ➤ Enter First Name                 : ");
			String firstName = ValidationChecker.checkFirstName();
			account.setFirstName(firstName);

			System.out.print("\n  ➤ Enter Middle Name                : ");
			String middleName = ValidationChecker.checkMiddleName();
			account.setMiddleName(middleName);

			System.out.print("\n  ➤ Enter Last Name                  : ");
			String lastName = ValidationChecker.checkLastName();
			account.setLastName(lastName);

			System.out.println("\n✓  Name Updated Successfully...");
			System.out.println("---------------------------------------------------\n");

		} catch (Exception e) {

			System.out.println("\n  ◆ Invalid Input : " + e.getMessage());
		}
	}

	@Override
	public void updatePhoneNumber() {

		try {

			System.out.println("\n---------------------------------------------------");
			System.out.println("           UPDATE PHONE NUMBER PROCESS");
			System.out.println("---------------------------------------------------\n");

			System.out.print("➤  Enter Updated Phone Number           : ");

			String phnNo = ValidationChecker.getValidMobileno();
			account.setPhoneNo(phnNo);

			System.out.println("\n✓  Phone Number Updated Successfully...");
			System.out.println("---------------------------------------------------\n");

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

			System.out.print("➤  Enter Updated Address           : ");

			sc.nextLine();
			String address = sc.nextLine();

			account.setAccountHolderAddress(address);

			System.out.println("\n✓  Address Updated Successfully...");
			System.out.println("---------------------------------------------------\n");

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

			System.out.print("➤  Enter Updated Aadhar Number           : ");
			sc.nextLine();
			String aadharNo = ValidationChecker.aadharValidation();
			account.setAddharNo(aadharNo);

			System.out.println("\n✓  Aadhar Number Updated Successfully...");
			System.out.println("---------------------------------------------------\n");

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

			System.out.print("➤  Enter Updated PAN Number           : ");

			String panNo = ValidationChecker.checkValidPanNumber();
			account.setPanNo(panNo);

			System.out.println("\n✓  PAN Number Updated Successfully...");
			System.out.println("---------------------------------------------------\n");

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

			System.out.print("➤  Enter Updated Email Address           : ");

			String emailAddress = ValidationChecker.emailValidation();
			account.setEmailId(emailAddress);

			System.out.println("\n✓  Email Address Updated Successfully...");
			System.out.println("---------------------------------------------------\n");

		} catch (Exception e) {

			System.out.println("\n  ◆ Invalid Input : " + e.getMessage());
		}
	}
}