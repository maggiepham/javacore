package java_methods;

/*
 * Methods are action called functions which is used to expose the behavior of an object.
 * Method can be reuse and optimization the code
 * 
*/

/*
 * Syntax:
 * modifier returnType nameOfMethod(Parameter List){ //method body }
 * modifier : defines the access type of the method, optional
 * returnType : method may return a value
 * nameOfMethod : name of the method
 * parameter List : the list of parameters, it is the type / order / number of parameters of a method, optional. Method may contain zero paramters
 * method body : defines what the method does with the statements
 */

/*
 * Example:
 * public static int methodName(int a, int b) { // body}
 * modifier : public static
 * return type : int
 * name of the method : methodName
 * formal parameters : a, b
 * list of paramaeter : int a, int b
 */

/*
 * Method Calling
 * Using a method, it should be called. Two ways in which a method is called
 * method returns a value
 * returning nothing (no return value)
 * When method is called, it returns control to the caller in 2 condition:
 *  - the return statement is executed
 *  - it reaches the method ending closing brace
 */

/*
 * The void keyword
 * allow us to create methods which do not return a value.
 */

/*
 * Passing Parameters by Value
 * while working under calling process, arguments is to be passed by value or reference
 * Passing parameters by Value is calling a method with a parameter, through this, the argument value is passed to the parameter
 */

/*
 * Method Overloading
 * Method overloading when a class has two or more methods by the same name but different parameters.
 * Overriding is a method has the same method name, type, number of parameters, etc
 * 
 */

/*
 * Using Command-Line Arguments
 * to pass some information into a program when it's executed
 * it's stored as strings in the String array passed to main() method
 */

/*
 * The this keyword
 * is used as a reference to the object of the current class within an instance method or constructor
 * Using this you can refer the members of a class such as constructors, instance variables and methods
 */

/* 
 * Variable Arguments (var-args)
 * typeName ... parameterName
 * Only one variable-length parameter may be specified in a method, this parameter must be the last parameter, any regular parameters must precede it
 */

/*
 * The finalize() Method
 * define a method that will be called just before an object's final destruction by the garbage collector.
 * is used to ensure that an object terminate cleanly
 * Ex: use finailize() method to make sure that an open file owned by that object is closed
 */


public class JavaMethods {
	
	protected void finalized() {
		// finalization code
	}
	

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
	
	/** The method returns minimum between two numbers */
	public static int minFunction(int n1, int n2) {
		int min;
		if(n1 > n2) {
			min = n2;
		}else {
			min = n1;
		}
		return min;
	}
	
	public static void methodRankPoints(double points) {
		if(points >= 202.5) {
			System.out.println("Rank : A1");
		} else if(points >= 122.4){
			System.out.println("Rank : A2");
		} else {
			System.out.println("Rank : A3");
		}
		
	}
	
	public static void swrapFuction(int a1, int b1) {
		System.out.println("Before swapping(Inside), a1 = " + a1 + " b1 = " + b1);
		
		// Swap n1 with n2
		int c1 = a1;
		a1 = b1;
		b1 = c1;
		System.out.println("After swapping(Inside), a1 = " + a1 + " b1 = " + b1);
	}
	
	public static int minOverloadFunction(int n3, int n4) {
		int min;
		if(n3 > n4) {
			min = n4;
		} else {
			min = n3;
		}
		return min;
	}
	
	public static double minOverloadFunction(double n3, double n4) {
		double min;
		if(n3 > n4)
			min = n4;
		else
			min = n3;
		return min;
	}
	
	// this keyword is used to differentiate (phan biet) the instance variables from local variables if they have same names, within a constructor or a method
//	int ageThisKeyword;
//	public JavaMethods(int ageThisKeyword) {
//		this.ageThisKeyword = ageThisKeyword;
//	}
	
	// this keyword call one type of constructor (parametrized constructor or default) from other in a class. I's explicit constructor invocation
//	int age1;
//	JavaMethods() {
//		this(20);
//	}
//	JavaMethods(int age1) {
//		this.age1 = age1;
//	}
	
	// Instance variable num
	int num = 10;
	JavaMethods(){
		System.out.println("This is an example program on keyword this");
	}
	
	JavaMethods(int num){
		// Invoking the default constructor
		this();
		//Assign the local variable num to the instance variable num
		this.num = num;
	}
	
	public void greet() {
		System.out.println("Hi Welcome to Tutorialspoint");
	}
	
	public void print() {
		// Local variable num
		int num = 20;
		// Printing the local variable
		System.out.println("Value of local variable num is : " + num);
		//Invoking the greet method of a class
		this.greet();
	}
	
	public static void printMax(double ... numbers) {
		if(numbers.length == 0) {
			System.out.println("No argument passed");
			return;
		}
		
		double result = numbers[0];
		for(int i = 1; i < numbers.length; i++) {
			if(numbers[i] > result)
				result = numbers[i];
			System.out.println("The max value is " + result);
		}
	}
	
	public static void main(String[] args) {
		
		
		// Command-line
		for(int i = 0; i<args.length; i++) {
			System.out.println("args[" + i + "]: " + args[i]);
		}
				
		// Call method
		myMethod();
		methodWithParam("John");
		System.out.println(methodKeyword(3));
		checkAge(19);
		
		// return min of 2 numbers
		int a = 11;
		int b = 6;
		int c = minFunction(a, b);
		System.out.println("Minimum Value = " + c);
		
		methodRankPoints(255.7);
		
		// Swap function
		int a1 = 30;
		int b1 = 45;
		System.out.println("Before swapping(Inside), a1 = " + a1 + " b1 = " + b1);
		
		// Invoke the swap method
		swrapFuction(a1, b1);
		System.out.println("\n**Now, Before and After swapping values will be same here**:");
		System.out.println("After swapping, a1 = " + a1 + " and b1 is " + b1);
		
		// Overloading
		int a3 = 11;
		int b3 = 6;
		double c3 = 7.3;
		double d3 = 9.4;
		int result3 = minOverloadFunction(a3, b3);
		
		// same function name with different parameters
		double result4 = minOverloadFunction(c3, d3);
		System.out.println("Minimum Value = " + result3);
		System.out.println("Minimum Value = " + result4);
		
		
		// Instantiating the class
		JavaMethods obj1 = new JavaMethods();
		// Invoking the print method
		obj1.print();
		
		// Passing a new value to the num variable through parametrized constructor
		JavaMethods obj2 = new JavaMethods(30);
		// Invoking the print method again
		obj2.print();
		
		// Call method with variable args
		printMax(34, 3, 3, 2, 56.5);
		printMax(new double[] {1, 2, 3});
		
	}
	

}
