package java_basic;

public class Java_For_Loop {
	/*
	 * When you know exactly how many times you want to loop through a block of code, use the for loop
	 * for(statement 1; statement 2; statement 3){ // code block to be executed}
	 * statement 1: set initial variable before the loop starts
	 * statement 2: defines the condition for the loop to run. If the condition is true, the loop will start over again, if it is false, the loop will end
	 * statement 3: increment/decrement a value each time the code block in the loop has been executed 
	 */
	
	/*
	 * labeled for loop
	 * To named of each Java for loop, use label befor the loop. It's useful while using the nested for loop as we can break/continue specific for loop
	 * for (initialization; condition; increament/decrement){// code to be executed}
	 */
	
	/*
	 * for-each loop is used exclusively to loop through elements in an array / collection
	 * for(data_type variableName : array_Name){//code to be executed}
	 */

	public static void main(String[] args) {
		System.out.println("=============for loop ===========");
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		System.out.println("===============");
		
		for(int i = 0; i <= 10; i = i + 2) {
			System.out.println(i);
		}
		
		System.out.println("================");
		for(int j = 0; j < 5; j++) {
			System.out.println("Yes");
		}
		
		System.out.println("=============Labeled for loop ===========");
		aa:
			for(int i = 1; i <= 3; i++) {
				bb:
					for(int j = 1; j <= 3; j++) {
						if(i == 2 && j == 2) {
							break bb;
						}
						System.out.println(i + " " + j);
					}
			}
		
		
		System.out.println("=============for - each loop===========");
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for(String i : cars) {
			System.out.println(i);
		}
		
		System.out.println("================");
		int[] arr = {12, 23, 44, 56, 78};
		for(int i : arr) {
			System.out.println(i);
		}
		
		
		System.out.println("=============Nested for loop===========");
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 3; j++) {
				System.out.println(i + " " + j);
			}
		}
		
		
		for(int k = 1; k <= 5; k++) {
			for(int f = 1; f <= k; f++) {
				System.out.print("* ");
			}
			System.out.println(); // new line
		}
		
		System.out.println("=================");
		int term = 6;
		for(int i = 1; i <= term; i++) {
			for(int j = term; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
//		System.out.println("=============Infinitive for loop===========");
//		for(;;) {
//			System.out.println("infinitive loop");
//		}
	}

}
