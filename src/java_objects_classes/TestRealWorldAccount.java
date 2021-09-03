package java_objects_classes;

public class TestRealWorldAccount {
	
	/*
	 * Demostrate with the working of a banking-system
	 * where we deposit and withdraw amount from our account
	 * Creating an RealWorldAccount class which has deposit() and withdraw() methods
	 */

	public static void main(String[] args) {
		RealWorldAccount rwa = new RealWorldAccount();
		rwa.insert(832345, "Maggie", 1000);
		rwa.display();
		
		rwa.checkBalance();
		
		rwa.deposit(40000);
		rwa.checkBalance();
		
		rwa.withdraw(15000);
		rwa.checkBalance();
	}

}
