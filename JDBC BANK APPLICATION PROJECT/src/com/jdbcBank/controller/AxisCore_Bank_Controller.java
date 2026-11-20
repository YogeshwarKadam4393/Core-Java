package com.jdbcBank.controller;

import java.sql.Connection;
import java.util.Scanner;

import com.jdbcBank.connection.My_Connection;
import com.jdbcBank.exceptionHandlers.Exception_Handlers;
import com.jdbcBank.service.RBI;
import com.jdbcBank.serviceIMPL.AxisCore_Bank;

public class AxisCore_Bank_Controller {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RBI rbi = new AxisCore_Bank();
		displayTitle();
		runAxisCore_Bank_Controller(sc,rbi);
		sc.close();
	}
	
	private static void displayTitle() {
		System.out.println("");
		System.out.println("===============================================================");
        System.out.println("|                                                             |");
        System.out.println("|                 WELCOME TO Axis Core Bank                   |");
        System.out.println("|             Empowering Your Financial Future.               |");
        System.out.println("|                                                             |");
        System.out.println("===============================================================");
	}
	
	public static void runAxisCore_Bank_Controller(Scanner sc, RBI rbi) {
		boolean flag = true;
		try(Connection connection = My_Connection.getConnection()) {
			while(flag) {
				System.out.println("===============================================================");
				System.out.println("|               Axis Core Bank - MAIN MENU                    |");
				System.out.println("===============================================================");
				System.out.println("| Option | Description                                        |");
				System.out.println("---------------------------------------------------------------");
				System.out.println("|   1    | Open Account                                       |");
				System.out.println("|   2    | Get Account Details                                |");
				System.out.println("---------------------------------------------------------------");
				System.out.println("|   3    | Check Account Balance                              |");
				System.out.println("|   4    | Withdraw Funds                                     |");
				System.out.println("---------------------------------------------------------------");
				System.out.println("|   5    | Deposit Funds                                      |");
				System.out.println("|   6    | Update Account Details                             |");
				System.out.println("|   7    | Change PIN                                         |");
				System.out.println("---------------------------------------------------------------");
				System.out.println("|   8    | Delete Account                                     |");
				System.out.println("|   9    | Exit Application                                   |");
				System.out.println("===============================================================");
				System.out.print("--> Enter Your Preferred Option :- ");
				int op = Exception_Handlers.getVerifiedUserChoice();
				System.out.println("===============================================================");
				System.out.println("");
				switch (op) {
				case 1:
					rbi.openAccount(connection);
					break;
				case 2:
					rbi.getAccountDetails(connection);
					break;
				case 3:
					rbi.getAccountBalance(connection);
					break;
				case 4:
					rbi.withdrawFunds(connection);
					break;
				case 5:
					rbi.depositFunds(connection);
					break;
				case 6:
					rbi.updateAccountDetails(connection);
					break;
				case 7:
					rbi.changePIN(connection);
					break;
				case 8:
					rbi.deleteAccount(connection);
					break;
				case 9:
					System.out.print("--> Exit The Application(y/n) :- ");
					char input = sc.next().toLowerCase().charAt(0);
					if(input == 'y') {
						System.out.println("");
						System.out.println("==============================================================");
						System.out.println("||             Session terminated successfully.             ||");
						System.out.println("||         Thank you for using our banking services.        ||");
						System.out.println("==============================================================");
						flag = false;
					}if (input == 'n') {
						System.out.println("");
						System.out.println("==========================================================================");
						System.out.println("|| Termination request cancelled. Resuming application operations. . .  ||");
						System.out.println("==========================================================================");
					}
					break;
				default:
					System.out.println("--> [ERROR] Invalid Option");
					break;
				}
			}
		} catch (Exception e) {
			System.out.println(e);
			
		}
	}
}



