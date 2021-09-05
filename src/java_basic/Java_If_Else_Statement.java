package java_basic;

public class Java_If_Else_Statement {

	public static void main(String[] args) {
		
		// if statement
		int age = 20;
		if(age > 18) {
			System.out.println("Age is greater than 18");
		}
		
		// if else statement
		int number = 13;
		if(number%2 == 0) {
			System.out.println("even number");
		}else {
			System.out.println("odd number");
		}
		
		// Leap year by using if else statement
		int year = 2020;
		if(((year % 4 == 0) && (year % 100 !=0)) || (year % 400 == 0)) {
			System.out.println("LEAP YEAR");
		}
		else {
			System.out.println("COMMON YEAR");
		}
		
		// if .. else statement by using Ternary Operator. If the condition is TRUE, the result of ? is returned, if the condition is false, the result of : is returned
		// variable = (condition) ? expressionTrue : expressionFalse;
		int numberTernary = 13;
		int time = 20;
		
		String output = (numberTernary%2 == 0) ? "even number" : "odd number";
		String result = (time < 18) ? "Good day." : "Good evening.";
		System.out.println(output);
		System.out.println(result);
		
		
		// if ... else ... if ladder statement : execute one condition from multiple statements
		int marks = 65;
		if(marks < 50) {
			System.out.println("fail");
		}
		else if(marks >= 50 && marks < 60){
			System.out.println("D grade");
		}
		else if(marks >= 60 && marks < 70) {
			System.out.println("C grade");
		}
		else if(marks >= 70 && marks < 80) {
			System.out.println("B grade");
		}
		else if(marks >= 80 && marks < 90) {
			System.out.println("A grade");
		}
		else if(marks >= 90 && marks < 100) {
			System.out.println("A+ grade");
		}
		else {
			System.out.println("Invalid");
		}
		
		//=======================
		int numberPNZ = -13;
		if(numberPNZ > 0) {
			System.out.println("POSITIVE");
		}
		else if(numberPNZ < 0) {
			System.out.println("NEGATIVE");
		}else {
			System.out.println("ZERO");
		}
		
		
		// Nested if statement: if block within another if block. the inner if block condition executes only when outer if block condition is true
		int ageN = 17;
		int weight = 40;
		
		if(ageN >= 18) {
			if(weight > 50) {
				System.out.println("You are eligible to donate blood");
			}else {
				System.out.println("You are not eligible to donate blood");
			}
		}else {
			System.out.println("Age must be greater than 18");
		}
		
	}

}
