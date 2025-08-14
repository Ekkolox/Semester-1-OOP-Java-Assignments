package assignments;

public class Bank_Account_Simulation {
	private String accountHolder;
	private int accountNumber;
	private int balance;
//Creating the constructor
public Bank_Account_Simulation(String accountHolder, int accountNumber, int balance) {
	this.accountHolder = accountHolder;
	this.accountNumber = accountNumber;
	this.balance = balance;
}

public String getAccountHolder() {
	return accountHolder;
}
public int getAccountNumber() {
	return accountNumber;
}
public int getBalance() {
	return balance;
}
	
public void setAccountHolder(String accountHolder) {
	this.accountHolder = accountHolder;
}
public void setaccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}
//Method to deposit money into the account
public void deposit(int amount) {
	if (amount > 0) {
		balance += amount;
		System.out.println("New balance: " + balance); 
	
	} else {
		System.out.println("Amount to be deposited must not be negative");
	}
}
public void withdraw(int amount) {
	if (amount <= balance) {
		balance -= amount;
		System.out.println("New balance:" + balance);

	} else {
		System.out.println("You cannot withdraw over current balance");
	}


}


}
