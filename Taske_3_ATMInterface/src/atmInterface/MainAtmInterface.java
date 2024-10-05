package atmInterface;

public class MainAtmInterface {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(1000.0);
		ATMInterface atm = new ATMInterface(account);
		atm.run();

	}

}
