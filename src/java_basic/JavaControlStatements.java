package java_basic;

public class JavaControlStatements {
	/*
	 * 1. Decision Making statements
	 * If statement:
	 * 	- simple if statment
	 * 		if(condition) {
				statement 1; // executes when condition is true
		
			}
			
	 * 	- if-else statment
	 * 		if(condition) {
				statement 1; // executes when condition is true
		
			} else {
				statement 2; // executes when condition is false
			}
			
	 * 	- if-else-if ladder
	 * 		if(condition) {
				statement 1; // executes when condition is true
		
			} 
			else if {
				statement 2; // executes when condition is true
			} 
			else {
				statement 2; // executes when condition is false
			}
			
	 *  - Nested if-statement
	 *   
	 * switch statement
	 */
	
	/*
	 * 2. Loop statements
	 * do while loop
	 * while loop
	 * for loop
	 * for-each loop
	 */
	
	/*
	 * 3. Jump statements
	 * break statement
	 * continue statement
	 */

	public static void main(String[] args) {
		// simple if statment
		int x = 10;
		int y = 12;
		if (x+y > 20) {
			System.out.println("simple if statment: " + "x + y is greater than 10");
		}
	
		// if-else statment
		if (x+y < 10) {
			System.out.println("if-else statment: " + "x + y is less than 10");
		} else {
			System.out.println("if-else statment: " + "x + y is greater than 10");
		}
		
		// if-else-if ladder
		String city = "Delhi";
		if(city == "Meerut") {
			System.out.println("city is merrut");
		} else if(city == "Noida") {
			System.out.println("city is noida");
		} else if (city == "Agra") {
			System.out.println("city is agra");
		} else {
			System.out.println(city);
		}
		

	}

}
