package atmInterface;

public class BankAccount {
	private double balance;
	int pin;
	
	public BankAccount(double openingBalance){
		balance = openingBalance;
	}

	public double getBalance() {
		return balance;
	}

	public void deposite(double amount) {
		if(amount>0 && balance >= amount) {
			balance +=amount;
			System.out.println("The Amount $" + amount + "Deposited Successfully.");
		}else {
			System.out.println("please Enter valid deposite amount");
			}
		}
	public boolean withdraw(double amount) {
		if(amount>0 && balance >= amount) {
			balance -=amount;
			System.out.println("The Amount $" + amount + "Withdrawn Successfully.");
			return true;
		}else {
			System.out.println("Insufficient Balance");
			return false;
			}
		}
	
	
}
