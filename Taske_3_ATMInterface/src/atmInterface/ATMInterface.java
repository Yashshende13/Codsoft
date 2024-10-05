package atmInterface;

import java.util.Scanner;

public class ATMInterface {
	private BankAccount account;

	public ATMInterface(BankAccount account) {

		this.account = account;
	}
	
	public void displayOptions() {
		System.out.println("Welcome To The ATM");
		System.out.println("---------------------");
		
		System.out.println("1.Check Balance");
		System.out.println("2.Deposit");
		System.out.println("3.Withdraw");
		System.out.println("4.Exit");
		System.out.println("---------------------");
		
	}
	
	public void run() {
		Scanner sn = new Scanner(System.in);
		int choice;
		double amount;
		while(true) {
			displayOptions();
			System.out.println("Enter Your Choice: ");
			choice = sn.nextInt();
			
			switch(choice) {
			case 1 : 
				System.out.println("---------------------");
				System.out.println("Current Balance: $"  + account.getBalance());
				System.out.println("---------------------");
				break;
				
			case 2 :
				System.out.println("Enter Deposite Amount: $");
				amount = sn.nextDouble();
				account.deposite(amount);
				break;
			case 3 :
				System.out.println("Enter Your PIN:");
				int pin = sn.nextInt();
				
				if(pin == 1234) {
					System.out.println("Enter your Withdrawal amount: $");
					amount = sn.nextDouble();
					
					if(account.withdraw(amount)) {
						System.out.println("Please Collect your Cash.");
						System.out.println("---------------------");
						System.out.println("Remaining balance $:" + account.getBalance());
						System.out.println("---------------------");
					}
					
				}else {
					System.out.println("Incorrect PIN. Please Try Again..!");
				}
				break;
				
			case 4 :
				System.out.println("Thank You For Visiting ATM. GoodBye..!");
				sn.close();
				return;
				
				default:
					System.out.println("invalid choice.Please try Again");
			}
			
		}
	}
	

}
