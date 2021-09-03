package java_methods;

/*
Methods are action called functions which is used to expose the behavior of an object.
Method can be reuse and optimization the code
*/

public class JavaMethods {

	// method
	public static void myMethod() {
		System.out.println("I just got executed!");
	}
	
	static void methodWithParam(String fname) {
		System.out.println(fname + " Doe");
	}
	
	static int methodKeyword(int x) {
		return x = 5 + x;
	}
	
	static void checkAge(int age) {
		if(age < 18) {
			System.out.println("Access Denied");
		} else {
			System.out.println("Access granted");
		}
	}
	
	public static void main(String[] args) {
		// Call method
		myMethod();
		methodWithParam("John");
		System.out.println(methodKeyword(3));
		checkAge(19);
	}

}
