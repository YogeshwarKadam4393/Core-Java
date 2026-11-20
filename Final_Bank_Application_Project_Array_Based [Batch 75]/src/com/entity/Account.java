package com.entity;

public class Account {

	private long accountNo;

	private String firstName;

	private String middleName;

	private String lastName;

	private String accountHolderAddress;

	private String phoneNo;

	private String emailId;

	private String panNo;

	private String addharNo;

	private double balance;

	private String userName;

	private String password;
	

	public long generateAccountNumber() { // To Generate Account Number Auto Generated
		long accountNoGenerator = (long) (Math.random() * Math.pow(10, 12));
		return accountNoGenerator;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAccountHolderAddress() {
		return accountHolderAddress;
	}

	public void setAccountHolderAddress(String accountHolderAddress) {
		this.accountHolderAddress = accountHolderAddress;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public String getAddharNo() {
		return addharNo;
	}

	public void setAddharNo(String addharNo) {
		this.addharNo = addharNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", accountHolderAddress=" + accountHolderAddress + ", phoneNo=" + phoneNo
				+ ", emailId=" + emailId + ", panNo=" + panNo + ", addharNo=" + addharNo + ", balance=" + balance
				+ ", userName=" + userName + ", password=" + password + "]";
	}

}
