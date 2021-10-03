package java_basic;

public class Java_Constructors {
	
	/*
	 * A constructor initializes an object when it's created
	 * It has the same name as its class and is syntactically(ve mat cu phap) similar to a method
	 * Constructors have no explicit (ro rang) return type
	 * There are two types of conctructors namely:
	 * - No argument constructors
	 * - Parameterized constructors
	 * Syntax : class ClassName{ ClassName(){ } }
	 */

	// No argument constructors
	int num;
	Java_Constructors(){
		num = 100;
	}
	
	// Parameterized constructors
	int x;
	Java_Constructors(int i){
		x = i;
	}
	
	public static void main(String[] args) {
		
		// Call no argument constructor to initialize objects
		Java_Constructors myJC1 = new Java_Constructors();
		Java_Constructors myJC2 = new Java_Constructors();
		System.out.println(myJC1.num + " " + myJC2.num);
		
		// Call parameterized constructor to initialize objects
		Java_Constructors jcParam1 = new Java_Constructors(10);
		Java_Constructors jcParam2 = new Java_Constructors(20);
		System.out.println(jcParam1.x + " " + jcParam2.x);
		
	}

}
