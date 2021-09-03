package java_objects_classes;

public class RealWorldAccount {
	int acc_no;
	String name;
	float amount;
	
	// Method to initialize object
	void insert(int a, String n, float amt) {
		acc_no = a;
		name = n;
		amount = amt;
	}
	
	// deposit method
	void deposit(float amt) {
		amount = amount + amt;
		System.out.println(amt + "deposited");
	}
	
	// withdraw method
	void withdraw (float amt) {
		if(amount < amt) {
			System.out.println("Insufficient Balance");
		} else {
			amount = amount -  amt;
			System.out.println(amt + "withdrawn");
		}
	}
	
	// check the balance of the account
	void checkBalance() {
		System.out.println("Balance is: " + amount);
	}
	
	// Display the values of an object
	void display() {
		System.out.println(acc_no + " " + name + " " + amount);
	}

}
