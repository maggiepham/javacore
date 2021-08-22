package java_methods;

public class JavaMethodOverloading {
	/*
	 * Method Overloading
	 * multiple methods can have the same name as long as different types of parameters
	 */

	static int overloadMethodWithDifferentTypes(int x, int y) {
		return x + y;
	}
	
	static double overloadMethodWithDifferentTypes(double x, double y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		
		int myInt = overloadMethodWithDifferentTypes(8, 5);
		double myDouble = overloadMethodWithDifferentTypes(4.3, 6.26);
		System.out.println("The methods with type Int: " + myInt);
		System.out.println("The method with type Double: " + myDouble);
	}

}
