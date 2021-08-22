package java_methods;

public class JavaMethodParameters {

	/*
	 * Parameters and Arguments
	 * Parameter is the information act as variable inside the method
	 * Parameters are specified after the method name, inside the parentheses, can add many parameters separate with a comma.
	 * When a parameter is passed to the method, it called an argument
	 */
	static void paramArgument(String firstname) {
		System.out.println("The parameter and agurment: " + firstname + " Pham");
	}
	
	
	/*
	 * Multiple Parameters
	 * The method call must have the same number of arguments as there are parameters, arguments must be passed in the same order
	 */
	static void multipleParams(String firstname, int age) {
		System.out.println("Multiple parameters: " + firstname + " is " + age);
	}
	
	/*
	 * Return Values
	 * void keyword indicates that the method should not return a value
	 * If the method returns value, use primitive data type (int, String, ...) instead of void, and the return keyword inside of the method
	 */
	static int returnMethod(int x) {
		return 5 + x;
		
	}
	
	static int returnTwoParamsMethod(int x, int y){
		return x + y;
	}	
	
	static int storeResultInVariable(int x, int y) {
		return x + y;
	}
	
	static void checkAge(int age) {
		if(age < 18) {
			System.out.println("The age is less than 18. Access denied - You are not old enough!");
		} else {
			System.out.println("The age is greater than, or equal 18. Access granted - You are old enough!");
		}
	}
	
	public static void main(String[] args) {
		
		paramArgument("Maggie");
		multipleParams("Maggie", 20);
		System.out.println("Return Method: " + returnMethod(3));
		System.out.println("Return Two Parameters Method: " + returnTwoParamsMethod(5, 6));
		
		int z = storeResultInVariable(6, 8);
		System.out.println("Store the result in variable: " + z);
		
		checkAge(20);
	}

}
