package com.jdbcBank.serviceIMPL;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

import com.jdbcBank.connection.My_Connection;
import com.jdbcBank.model.AccountNoGenerator;
import com.jdbcBank.service.RBI;
import com.jdbcBank.validation.Validation;

public class AxisCore_Bank implements RBI {

	Scanner sc = new Scanner(System.in);

	@Override
	public void openAccount(Connection connection) {
		System.out.print("--> Enter The Number Of Account To Create :- ");
		int n = sc.nextInt();
		System.out.println("");
		String query1 = "INSERT INTO account(Account_No,Account_Holder_Name," + "Mobile_No,Email_ID,PIN,Aadhar_Card_No,"
				+ "Pan_Card_No,Address,Account_Balance) VALUES(?,?,?,?,?,?,?,?,?)";
		try (PreparedStatement ps = connection.prepareStatement(query1);) {
			for (int i = 1, j = 1; i <= n; ++i, ++j) {
				System.out.println("======================================");
				System.out.println("||     Account Holder " + j + " Details     ||");
				System.out.println("======================================");
				long accno = AccountNoGenerator.generateAccountNo();
				ps.setLong(1, accno);
				System.out.print("--> Enter Account Holder Name    :- ");
				ps.setString(2, Validation.validateName());
				System.out.print("--> Enter Mobile No.             :- ");
				ps.setString(3, sc.next());
				System.out.print("--> Enter EMail ID               :- ");
				ps.setString(4, sc.next());
				System.out.println("--> Generated Account No.        :- " + accno);
				System.out.print("--> Set PIN                      :- ");
				ps.setInt(5, sc.nextInt());
				System.out.print("--> Enter Aadhaar Card No        :- ");
				ps.setString(6, sc.next());
				System.out.print("--> Enter Pan Card No            :- ");
				ps.setString(7, sc.next());
				System.out.print("--> Enter Account Holder Address :- ");
				ps.setString(8, sc.next());
				System.out.print("--> Enter Account Balance        :- Rs.");
				ps.setBigDecimal(9, sc.nextBigDecimal());
				ps.executeUpdate();
				System.out.println("--> Record Inserted Successfully . . .");
				System.out.println("");
			}
			System.out.println("");
			System.out.println("==================================================");
			System.out.println("||   All Records Inserted Successfully . . .    ||");
			System.out.println("==================================================");
			System.out.println("");
		} catch (SQLException e) {
			System.out.println(e);
			System.out.println("");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("");
		}
	}

	@Override
	public void getAccountDetails(Connection connection) {
		String query1 = "SELECT * FROM account";
		try (Statement statement = connection.createStatement()) {
			System.out.println("");
			System.out.println("========================================");
			System.out.println("||      Fetching All Records . . .    ||");
			System.out.println("========================================");
			System.out.println("");
			ResultSet rs = statement.executeQuery(query1);
			System.out.println("=================================================");
			System.out.println("||          Account Holder Details             ||");
			System.out.println("=================================================");
			while (rs.next()) {
				System.out.println("||  Account Holder ID    :- " + rs.getInt(1));
				System.out.println("||  Account No           :- " + rs.getLong(2));
				System.out.println("||  Account Holder Name  :- " + rs.getString(3));
				System.out.println("||  Mobile No            :- " + rs.getString(4));
				System.out.println("||  Email ID             :- " + rs.getString(5));
				System.out.println("||  Aadhar Card No       :- " + rs.getString(7));
				System.out.println("||  Pan Card No          :- " + rs.getString(8));
				System.out.println("||  Address              :- " + rs.getString(9));
				System.out.println("||  Account Balance      :- Rs." + rs.getBigDecimal(10) + " /-");
				System.out.println("=================================================");
			}
			System.out.println("");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("");
		}
	}

	@Override
	public void getAccountBalance(Connection connection) {
		String sql = "SELECT Account_Balance FROM account WHERE Account_No = ? AND PIN = ?";
		try (PreparedStatement ps = connection.prepareStatement(sql)) {
			System.out.print("--> Enter Account No :- ");
			ps.setLong(1, sc.nextLong());
			System.out.print("--> Enter PIN  :- ");
			ps.setInt(2, sc.nextInt());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				System.out.println("");
				System.out.println("=================================================");
				System.out.println("|| CURRENT ACCOUNT BALANCE :- Rs." + rs.getBigDecimal(1) + " /-");
				System.out.println("=================================================");
			} else {
				System.out.println("--> [ERROR] Invalid Account No OR PIN !!");
				System.out.println("");
				return;
			}
			System.out.println("");
		} catch (SQLException e) {
			System.out.println(e);
			System.out.println("");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("");
		}
	}

	@Override
	public void withdrawFunds(Connection connection) {
		String sql = "SELECT Account_Balance FROM account WHERE Account_No = ? AND PIN = ?";
		String sql2 = "UPDATE account SET Account_Balance = ? WHERE Account_No = ? AND PIN = ?";
		try (PreparedStatement pst = connection.prepareStatement(sql)) {
			System.out.print("--> Enter Account No :- ");
			long accno = sc.nextLong();
			pst.setLong(1, accno);
			System.out.print("--> Enter PIN  :- ");
			int pin = sc.nextInt();
			pst.setInt(2, pin);
			ResultSet rs = pst.executeQuery();
			BigDecimal balance;
			if (rs.next()) {
				balance = rs.getBigDecimal(1);
				System.out.print("--> Enter Withdraw Amount :- Rs.");
				BigDecimal withdraw = sc.nextBigDecimal();
				if (balance.compareTo(withdraw) >= 0) {
					BigDecimal updatedBalance = balance.subtract(withdraw);
					try (PreparedStatement pst2 = connection.prepareStatement(sql2)) {
						pst2.setLong(2, accno);
						pst2.setInt(3, pin);
						pst2.setBigDecimal(1, updatedBalance);
						pst2.executeUpdate();
						System.out.println("");
						System.out.println("--> Amount Withdrawn Successfully !!");
					} catch (SQLException e) {
						System.out.println(e);
						System.out.println("");
					} catch (Exception e) {
						System.out.println(e);
						System.out.println("");
					}
				} else {
					System.out.println("");
					System.out.println("--> Insufficient Balance !!");
				}
			} else {
				System.out.println("--> [ERROR] Invalid Account No OR PIN !!");
				System.out.println("");
				return;
			}
			System.out.println("");

		} catch (SQLException e) {
			System.out.println(e);
			System.out.println("");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("");
		}
	}

	@Override
	public void depositFunds(Connection connection) {
		String sql = "UPDATE account SET Account_Balance = Account_Balance + ? WHERE Account_No = ? AND PIN = ?";
		try (PreparedStatement pst1 = connection.prepareStatement(sql)) {
			System.out.print("--> Enter Account No :- ");
			long accno = sc.nextLong();
			pst1.setLong(2, accno);
			System.out.print("--> Enter Pin :- ");
			int pin = sc.nextInt();
			pst1.setInt(3, pin);
			System.out.print("--> Enter Amount To Deposit :- Rs.");
			BigDecimal deposit = sc.nextBigDecimal();
			pst1.setBigDecimal(1, deposit);
			System.out.println("");
			System.out.println("--> Rs." + deposit + " /- Deposited Successfully");
			System.out.println("");
			pst1.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void updateAccountDetails(Connection connection) {
		boolean flag1 = true;
		//while (flag1) {
			String sql1 = "SELECT Account_Holder_Name,Mobile_No,Email_ID,Address FROM account WHERE Account_No = ? AND PIN = ? ";
			try (PreparedStatement pst1 = connection.prepareStatement(sql1)) {
				System.out.print("--> Enter Account No. :- ");
				long acc = sc.nextLong();
				pst1.setLong(1, acc);
				System.out.print("--> Enter PIN :- ");
				int pin = sc.nextInt();
				pst1.setInt(2, pin);
				ResultSet rs = pst1.executeQuery();
				boolean flag2 = true;
				if (rs.next()) {
					while (flag2) {
						System.out.println("");
						System.out.println("===============================================================");
						System.out.println("|             Axis Core Bank - UPDATE MENU                    |");
						System.out.println("===============================================================");
						System.out.println("| Option | Field to Update                                    |");
						System.out.println("---------------------------------------------------------------");
						System.out.println("|   1    | Account Holder Name                                |");
						System.out.println("|   2    | Mobile Number                                      |");
						System.out.println("---------------------------------------------------------------");
						System.out.println("|   3    | Email Address                                      |");
						System.out.println("|   4    | Address                                            |");
						System.out.println("---------------------------------------------------------------");
						System.out.println("|   5    | Exit Menu                                          |");
						System.out.println("===============================================================");
						System.out.print("--> Enter Your Preferred Option :- ");
						int op = sc.nextInt();
						System.out.println("===============================================================");
						System.out.println("");

						switch (op) {
						case 1:
							System.out.println(
									"--> Current Account Holder Name       :- " + rs.getString("Account_Holder_Name"));
							String sql2 = "UPDATE account SET Account_Holder_Name = ? WHERE Account_No = ? AND PIN = ?";
							try (PreparedStatement pst2 = connection.prepareStatement(sql2)) {
								System.out.print("--> Enter New Name For Account Holder :- ");
								pst2.setString(1, sc.next());
								pst2.setLong(2, acc);
								pst2.setInt(3, pin);
								pst2.executeUpdate();
								System.out.println("");
								System.out.println("--> Account Holder Name Updated Successfully !!");
								System.out.println("");
							} catch (Exception e) {
								System.out.println(e);
								System.out.println("");
							}
							break;
						case 2:
							System.out.println("--> Current Mobile No :- " + rs.getLong("Mobile_No"));
							String sql3 = "UPDATE account SET Mobile_No = ? WHERE Account_No = ? AND PIN = ?";
							try (PreparedStatement pst3 = connection.prepareStatement(sql3);) {
								System.out.print("--> Enter New Name Mobile No :- ");
								pst3.setInt(1, sc.nextInt());
								pst3.setLong(2, acc);
								pst3.setInt(3, pin);
								pst3.executeUpdate();
								System.out.println("");
								System.out.println("--> Mobile Number Updated Successfully !!");
								System.out.println("");
							} catch (Exception e) {
								System.out.println(e);
								System.out.println("");
							}
							break;
						case 3:
							System.out.println("--> Current Email Id :- " + rs.getString("Email_ID"));
							String sql4 = "UPDATE account SET Email_ID = ? WHERE Account_No = ? AND PIN = ?";
							try (PreparedStatement pst4 = connection.prepareStatement(sql4);) {
								System.out.print("--> Enter New Email ID :- ");
								String mail = sc.next();
								pst4.setString(1, mail);
								pst4.setLong(2, acc);
								pst4.setInt(3, pin);
								pst4.executeUpdate();
								System.out.println("");
								System.out.println("--> Email ID Updated Successfully !!");
								System.out.println("");
							} catch (Exception e) {
								System.out.println(e);
								System.out.println("");
							}
							break;
						case 4:
							System.out.println("--> Current Address :- " + rs.getString("Address"));
							String sql5 = "UPDATE account SET Address = ? WHERE Account_No = ? AND PIN = ?";
							try (PreparedStatement pst5 = connection.prepareStatement(sql5);) {
								System.out.print("--> Enter New Address :- ");
								pst5.setString(1, sc.next());
								pst5.setLong(2, acc);
								pst5.setInt(3, pin);
								pst5.executeUpdate();
								System.out.println("");
								System.out.println("--> Address Updated Successfully !!");
								System.out.println("");
							} catch (Exception e) {
								System.out.println(e);
								System.out.println("");
							}
							break;
						case 5:
							System.out.print("--> Exit The Menu (y/n) :- ");
							char input = sc.next().toLowerCase().charAt(0);
							if (input == 'y') {
								System.out.println("");
								System.out.println("--> Update process terminated. Redirecting to Main Menu..... ");
								flag1 = false;
								flag2 = false;
							}else if (input == 'n') {
								System.out.println("");
								System.out.println("--> Termination cancelled. Resuming Update Menu");
							}else {
								System.out.println("");
								System.out.println("--> [ERROR] Invalid Input !! Enter 'y' or 'n' only.");
							}
							break;
						default:
							break;
						}
					}
				}
			} catch (SQLException e) {
				System.out.println(e);
				System.out.println("");
			} catch (Exception e) {
				System.out.println(e);
				System.out.println("");
			}
		//}
	}
	
	@Override
	public void changePIN(Connection connection) {
		String sql = "UPDATE account SET PIN = ? WHERE Account_No = ? AND PIN = ?";
		try(PreparedStatement pst = connection.prepareStatement(sql)) {
			System.out.print("--> Enter Account No. :- ");
			pst.setLong(2, sc.nextLong());
			System.out.print("--> Enter OLD PIN :- ");
			pst.setInt(3, sc.nextInt());
			System.out.print("--> Enter NEW PIN :- ");
			pst.setInt(1, sc.nextInt());
			pst.executeUpdate();
			System.out.println("");
			System.out.println("--> PIN Changed Successfully !!");
			System.out.println("");
		} catch (SQLException e) {
			System.out.println(e);
			System.out.println("");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("");
		}
	}

	@Override
	public void deleteAccount(Connection connection) {
		String query1 = "DELETE FROM account WHERE Account_No = ? AND PIN = ? ";
		try(PreparedStatement pst = connection.prepareStatement(query1)) {
			System.out.print("--> Enter Account No. :- ");
			pst.setLong(1, sc.nextLong());
			System.out.print("--> Enter PIN :- ");
			pst.setInt(2, sc.nextInt());
			pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
			System.out.println("");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("");
		}
	}	
}
