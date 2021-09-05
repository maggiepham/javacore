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
	 * 		if(condition 1) {
				statement 1; // executes when condition is true
		
			} 
			else if (condition 2){
				statement 2; // executes when condition is true
			} 
			else if (condition 3) {
				statement 3; // executes when condition is true
			}
			...
			else {
				execute if all the conditions are false
			}
			
	 *  - Nested if-statement
	 *   if(condition 1) {
				statement 1; // executes when condition 1 is true
		
			}if(condition 2) {
				statement 2; // executes when condition 2 is true
			} 
			else {
				statement 2; // executes when condition 2 is false
			}
			
	 * switch statement
	 * switch (expression) {
	 * case value 1:
	 * 	statement 1;
	 * break;
	 * .
	 * .
	 * .
	 * case valueN:
	 * 	statement N;
	 * break;
	 * default:
	 * 	default statement;
	 * }
	 */
	
	/*
	 * 2. Loop statements
	 * do while loop
	 * do 
	 * {
	 * 	statements
	 * } while (condition);
	 * 
	 * while loop
	 * while (condition){
	 * 	looping statements
	 * }
	 * 
	 * for loop
	 * for(initialization, condition, increment/decrement){
	 *	 block of statements
	 * }
	 * 
	 * for-each loop
	 * for(data_type var : array_name/collection_name){
	 * 	statements
	 * }
	 */
	
	/*
	 * 3. Jump statements
	 * jump statements transfer the execution control to the other part of the program.
	 * There are two types of jump statements: break and continue
	 * 
	 * break statement
	 * is used to break the current flow and transfer the control to the next statement outside a loop or switch statement
	 * 
	 * continue statement
	 * doesn't break the loop, it skips the specific part of the loop and jumps to the next iteration of the loop immediately
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
		
		// Nested if-statement
		String address = "Delhi, India";
		
		if(address.endsWith("India")){
		if(address.contains("Meerut")) {
			System.out.println("Your city is Meerut");
		}else if(address.contains("Noida")) {
			System.out.println("Your city is Noida");
		}else {
			System.out.println(address.split(",")[0]);
		}
		}else {
			System.out.println("You are not living in India");
		}
		
		// switch statement
		int num = 2;
		switch(num) {
			case 0:
				System.out.println("number is 0");
			break;
			case 1:
				System.out.println("number is 1");
			break; // switch block when the condition is satisfied
			default: // execute when no any cases match the value of expression
				System.out.println(num);
		}
		
		// for loop
		int sumFor = 0;
		for(int i = 1; i <= 10; i++) {
			sumFor = sumFor + i;
		}
		System.out.println("The sum of first 10 natural number is " + sumFor);
		
		// for each loop
		String[] names = {"Java", "C", "C#", "Python", "JavaScript"};
		System.out.println("Printing the content of the array names:\n");
		for(String name:names) {
			System.out.println(name);
		}
		
		// while loop
		int j = 0;
		System.out.println("Printing the list of first 10 even numbers \n");
		while(j <= 10) {
			System.out.println(j);
			j = j + 2;
		}
		
		// do while loop
		int k = 0;
		System.out.println("Printing the list of first 10 even numbers \n");
		do {
			System.out.println(k);
			k = k + 2;
		} while (k <= 10);
		
		// break statement
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
			if(i == 6) {
				break;
			}
		}
		
		// break statement with labeled for loop
		a:
			for(int i = 0; i <= 10; i++) {
				b:
					for(int h = 0; h <= 15; h++) {
						c:
							for(int m = 0; m <= 20; m++) {
								System.out.println(m);
								if(m == 5) {
									break a;
								}
							}
					}
			}

		// continue statement
		for(int l = 0; l <= 2; l++) {
			for(int n = l; n <= 5; n++) {
				if(n == 4) {
					continue;
				}
				System.out.println(n);
			}
		}
	}

}
