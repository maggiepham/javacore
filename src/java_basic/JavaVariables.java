package java_basic;

public class JavaVariables {

	/*
	 * Variables are containers for storing data values
	 * is created inside the class but outside the body of method. It get memory at runtime when object/instance is created
	 * is not declared as static
	 * 3 types of variables: Local variable, Instance variable, Static variable
	 */
	
	/*
	 * Local variable:
	 * declared inside of the body of the method, and it can be used within that method
	 * cannot be defined with "static" keyword
	 */
	
	/*
	 * Instance variable:
	 * declared inside the class but outside the body of the method
	 * cannot declared as static 
	 * Instance variable's value is instance-specific and is not shared among instances
	 */
	
	/*
	 * Static variable:
	 * a variable is declared as static
	 * cannot be local
	 */
	
	static int m = 100; // static variable
	
	void method() {
		int n = 90; // local variable
	}
	
	
	public static void main(String[] args) {
		
		int data = 50; // instance variable
		
		// Widening
		int widening = 10;
		float fWiden = widening;
		System.out.println(widening);
		System.out.println(fWiden);
		
		// Narrowin (typecasting)
		float f = 10.5f;
		int a = (int)f;
		System.out.println(f);
		System.out.println(a);
		
		// Overflow
		int numberFlow = 130;
		byte overFlow = (byte)numberFlow;
		System.out.println(numberFlow);
		System.out.println(overFlow);
		
		// Adding Lower Type
		byte lowerType1 = 10;
		byte lowerType2 = 10;
		byte lowerType3 = (byte)(lowerType1 + lowerType2);
		System.out.println(lowerType3);
	}

}
