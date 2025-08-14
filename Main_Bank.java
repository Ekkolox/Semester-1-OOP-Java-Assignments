package assignments;

import java.util.Scanner;

public class Main_Bank {

	public static void main(String[] args) {
		Bank_Account_Simulation account1 = new Bank_Account_Simulation("Stunning Steve Austin", 44779, 5000);
		Bank_Account_Simulation account2 = new Bank_Account_Simulation("Jacob Fatu", 29929, 35000);
		Bank_Account_Simulation account3 = new Bank_Account_Simulation("Seth Rollins", 22567, 95555);
		Scanner scanner = new Scanner(System.in);
		
		Bank_Account_Simulation selectedAccount = null;
		
		System.out.print("Enter (1: for Stunning Steve Austin, 2:Jacob Fatu, 3:Seth Rollins): ");
		int choice = scanner.nextInt();
		
		switch (choice) {
		case 1:
			selectedAccount = account1;
			break;
		case 2: selectedAccount = account2;
			break;
		case 3: selectedAccount = account3;
			break;
		}
		
		while (true) {
			System.out.println("Welcome " + selectedAccount.getAccountHolder() + "!");
			System.out.println("1:Deposit");
			System.out.println("2: Withdraw");
			System.out.println("3: Check Balance");
			System.out.println("4: Exit");
			System.out.print("Enter choice: ");
			int action = scanner.nextInt();
			
			switch (action) {
			case 1://Deposit
				System.out.print("Enter amount to deposit: ");
				int depositAmount = scanner.nextInt();
				selectedAccount.deposit(depositAmount);
				break;
			case 2://Withdraw
				System.out.print("Enter amoun to withdraw: ");
				int withdrawAmount = scanner.nextInt();
				selectedAccount.withdraw(withdrawAmount);
				break;
			case 3://Check Balance
				System.out.println("Your balance is: " +  selectedAccount.getBalance());
				break;
			case 4://exit program
				System.out.print("Exiting program");
				scanner.close();
				return;
				
			}
			
			
		}
		

	}

}
